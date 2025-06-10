package com.SpringSecurity.Security.ServiceLayer;

import com.SpringSecurity.Security.CustomException.TestCustomExeption;
import com.SpringSecurity.Security.Entity.CloudVendor;
import com.SpringSecurity.Security.GlobalExceptionHandling.NOTFOUNDEXCEPTION;
import com.SpringSecurity.Security.RepositoryLayer.RepositoryLayer;
import com.SpringSecurity.Security.UserDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayerImplementation implements ServiceLayer {

    //Connect serviceLayer to RepositoryLayer
    @Autowired
    private RepositoryLayer repositoryLayer;

    @Override   //0>getAllVendors
    public List<CloudVendor> getAllVendors() {
        return repositoryLayer.findAll();
    }

    @Override   //1>getSingleVendor
    public CloudVendor getSingleVendor(int id) {
        if (repositoryLayer.findById(id).isEmpty()){
            throw new NOTFOUNDEXCEPTION("Please enter the valid id to extract single vendor details");
        }
       return repositoryLayer.findById(id).get();

    }

    @Override     //2>addVendors
    public CloudVendor addVendor(UserDTO userDTO) {
        CloudVendor cloudVendor=new CloudVendor();
        cloudVendor.setId(userDTO.getId());
        cloudVendor.setName(userDTO.getName());
        cloudVendor.setPassword(userDTO.getPassword());
        cloudVendor.setEmail(userDTO.getEmail());
        repositoryLayer.save(cloudVendor);
        return cloudVendor;
    }

    @Override
    public void deleteVendor(int id) {
        if (repositoryLayer.findById(id).isEmpty()){
            throw new NOTFOUNDEXCEPTION("Please enter the valid id to delete the vendor details");
        }
        repositoryLayer.deleteById(id);
    }

    @Override
    public CloudVendor updateVendor(UserDTO userDTO) {
        //check if data exist in the DB
        CloudVendor existingVendor=repositoryLayer.findById(userDTO.getId())
                        .orElseThrow(()->new NOTFOUNDEXCEPTION("CloudVendor not found by id"+userDTO.getId()));

        existingVendor.setId(userDTO.getId());
        existingVendor.setName(userDTO.getName());
        existingVendor.setPassword(userDTO.getPassword());
        existingVendor.setEmail(userDTO.getEmail());
        repositoryLayer.save(existingVendor);
        return existingVendor;
    }
}
