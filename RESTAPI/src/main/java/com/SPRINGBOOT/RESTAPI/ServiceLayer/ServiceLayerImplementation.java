package com.SPRINGBOOT.RESTAPI.ServiceLayer;

import com.SPRINGBOOT.RESTAPI.Entity.CloudVendor;
import com.SPRINGBOOT.RESTAPI.GlobalExceptionHandling.NOTFOUNDEXCEPTION;
import com.SPRINGBOOT.RESTAPI.RepositoryLayer.RepositoryLayer;
import com.SPRINGBOOT.RESTAPI.UserDTO.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayerImplementation implements ServiceLayer{
    //1>Connect service layer to repository Layer using constructor injection
    private final RepositoryLayer repositoryLayer;
    public ServiceLayerImplementation(RepositoryLayer repositoryLayer) {
        this.repositoryLayer = repositoryLayer;
    }

    @Override
    public List<CloudVendor> getAllVendors() {
        return repositoryLayer.findAll();
    }

    @Override
    public CloudVendor getSingleVendors(int id) {
        if ( repositoryLayer.findById(id).isEmpty()){
          throw new NOTFOUNDEXCEPTION("Please,Enter the Valid input to extract the respective vendor details");
        }
        return repositoryLayer.findById(id).get();
    }

    @Override
    public CloudVendor updateVendors(UserDTO userDTO) {
        //First check the vendor details to be updated in UserDTO is there in DataBase or not to avoid further errors..
        CloudVendor existingVendor=repositoryLayer.findById(userDTO.getId())
                .orElseThrow(()->new NOTFOUNDEXCEPTION("Vendor details not found by Id"+userDTO.getId()));
        //If details Found then update it
        existingVendor.setId(userDTO.getId());
        existingVendor.setName(userDTO.getName());
        existingVendor.setUserName(userDTO.getUserName());
        existingVendor.setPassWord(userDTO.getPassWord());
        //Save to DataBase
        repositoryLayer.save(existingVendor);
        return existingVendor;
    }

    @Override
    public void deleteVendors(int id) {
        if ( repositoryLayer.findById(id).isEmpty()){
            throw new NOTFOUNDEXCEPTION("Please,Enter the Valid input to delete the respective vendor details");
        }
         repositoryLayer.deleteById(id);
    }

    @Override
    public CloudVendor addVendors(UserDTO userDTO) {
        CloudVendor addVendors=new CloudVendor();
        addVendors.setId(userDTO.getId());
        addVendors.setName(userDTO.getName());
        addVendors.setUserName(userDTO.getUserName());
        addVendors.setPassWord(userDTO.getPassWord());
        repositoryLayer.save(addVendors);
        return addVendors;
    }
}
