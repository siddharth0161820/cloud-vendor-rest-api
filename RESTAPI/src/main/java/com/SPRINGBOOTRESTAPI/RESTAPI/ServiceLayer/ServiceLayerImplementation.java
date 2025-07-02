package com.SPRINGBOOTRESTAPI.RESTAPI.ServiceLayer;

import com.SPRINGBOOTRESTAPI.RESTAPI.Entity.CloudVendor;
import com.SPRINGBOOTRESTAPI.RESTAPI.GlobalExceptionHandling.NOTFOUNDEXCEPTION;
import com.SPRINGBOOTRESTAPI.RESTAPI.RepositoryLayer.RepositoryLayer;
import com.SPRINGBOOTRESTAPI.RESTAPI.UserDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayerImplementation implements ServiceLayer {
    //0>CONNECT SERVICE LAYER TO REPOSITORY LAYER
    @Autowired
    private RepositoryLayer repositoryLayer;

    @Override
    public List<CloudVendor> getAllVendors() {
        return repositoryLayer.findAll();
    }

    @Override
    public CloudVendor getSingleVendors(int id) {
        if (repositoryLayer.findById(id).isEmpty()){
            throw new NOTFOUNDEXCEPTION("Please enter the valid input to extract the respective Vendor details");
        }
        return repositoryLayer.findById(id).get();
    }

    @Override
    public CloudVendor addVendors(UserDTO userDTO) {
        CloudVendor cloudVendor=new CloudVendor();
        cloudVendor.setId(userDTO.getId());
        cloudVendor.setName(userDTO.getName());
        cloudVendor.setUserName(userDTO.getUserName());
        cloudVendor.setPassWord(userDTO.getPassWord());
        repositoryLayer.save(cloudVendor);
        return cloudVendor;
    }

    @Override
    public void deleteVendors(int id) {
        if (repositoryLayer.findById(id).isEmpty()){
            throw new NOTFOUNDEXCEPTION("Please enter the valid input to delete the respective Vendor details");
        }
         repositoryLayer.deleteById(id);
    }

    @Override
    public CloudVendor updateVendors(UserDTO userDTO) {
        //Check if vendor to be updated in the userDTO is present in the Database or not to avoid error
        CloudVendor existingVendor=repositoryLayer.findById(userDTO.getId()).
                orElseThrow(()->new NOTFOUNDEXCEPTION("Vendor Details not found"+userDTO.getId()));
      //Save Vendor details to Database
        repositoryLayer.save(existingVendor);
        return existingVendor;
    }
}
