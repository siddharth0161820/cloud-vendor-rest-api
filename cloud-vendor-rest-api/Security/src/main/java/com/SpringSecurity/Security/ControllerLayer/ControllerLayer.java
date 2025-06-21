package com.SpringSecurity.Security.ControllerLayer;

import com.SpringSecurity.Security.CustomException.TestCustomExeption;
import com.SpringSecurity.Security.Entity.CloudVendor;
import com.SpringSecurity.Security.ServiceLayer.ServiceLayer;
import com.SpringSecurity.Security.UserDTO.UserDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerLayer {
    //Connect serviceLayer to Controller Layer
      @Autowired
    private ServiceLayer serviceLayer;

      //DIFFERENT METHODS()

    //1>getAllVendors
    @GetMapping("/getAllVendors")
    public List<CloudVendor>getAllVendors(){
        return serviceLayer.getAllVendors();
    }

    //2>getSingleVendor
    @GetMapping("/getSingleVendor/{id}")
    public ResponseEntity<Object> getSingleVendor(@PathVariable int id){

       return TestCustomExeption.response(
                "HAR HAR MAHADEV",
                HttpStatus.OK,
                serviceLayer.getSingleVendor(id)
        );
    }

    //3>addVendor
    @PostMapping("/addVendor")
    public ResponseEntity<Object> addVendor(@Valid  @RequestBody UserDTO userDTO){
        CloudVendor addVendor=serviceLayer.addVendor(userDTO);
       return TestCustomExeption.response("CloudVendor Created",HttpStatus.CREATED,addVendor);
    }

    //4>deleteVendor
    @DeleteMapping("/deleteVendor/{id}")
    public ResponseEntity<Object> deleteVendor(@PathVariable int id){
        serviceLayer.deleteVendor(id);
        return TestCustomExeption.response(
                "DELETED SUCCESSFULLY",
                HttpStatus.OK,
                null
        );
    }
    //5>updateVendor
    @PutMapping("/updateVendor")
    public ResponseEntity<Object> updateVendor(@Valid @RequestBody UserDTO userDTO){
        CloudVendor exisitingVendor= serviceLayer.updateVendor(userDTO);
        return TestCustomExeption.response("CloudVendor Updated",HttpStatus.OK,exisitingVendor);
    }

}
