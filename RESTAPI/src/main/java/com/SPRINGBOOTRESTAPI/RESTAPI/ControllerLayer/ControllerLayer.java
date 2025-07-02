package com.SPRINGBOOTRESTAPI.RESTAPI.ControllerLayer;

import com.SPRINGBOOTRESTAPI.RESTAPI.CustomExceptionHandling.TestCustomException;
import com.SPRINGBOOTRESTAPI.RESTAPI.Entity.CloudVendor;
import com.SPRINGBOOTRESTAPI.RESTAPI.ServiceLayer.ServiceLayer;
import com.SPRINGBOOTRESTAPI.RESTAPI.UserDTO.UserDTO;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerLayer {
    //0>Connect controller layer to service layer
    @Autowired
    private ServiceLayer serviceLayer;

    //1>Methods()
     //1.0>getAllVendors
    @GetMapping("/getAllVendors")
    public List<CloudVendor>getAllVendors(){
        return this.serviceLayer.getAllVendors();
    }
    //1.1>getSingleVendors()
    @GetMapping("/getSingleVendors/{id}")
    public ResponseEntity<Object> getSingleVendors(@PathVariable int id){
       return TestCustomException.response(
                "HAR HAR MAHADEV",
                HttpStatus.OK,
                this.serviceLayer.getSingleVendors(id)
        );
    }
    //1.2>addVendors()
    @PostMapping("/addVendors")
    public ResponseEntity<Object> addVendors(@Valid  @RequestBody UserDTO userDTO){
        CloudVendor addVendor=this.serviceLayer.addVendors(userDTO);
        return TestCustomException.response("Vendor added",HttpStatus.CREATED,addVendor);
    }
    //1.3>deleteVendors()
    @DeleteMapping("/deleteVendors/{id}")
    public ResponseEntity<Object> deleteVendors(@PathVariable int id){
        this.serviceLayer.deleteVendors(id);
        return TestCustomException.response(
                "Deleted Successfully",
                HttpStatus.OK,
               null
        );
    }
    //1.5>updateVendors()
    @PutMapping("/updateVendors")
    public ResponseEntity<Object> updateVendors(@Valid @RequestBody UserDTO userDTO){
        CloudVendor updateVendors=this.serviceLayer.updateVendors(userDTO);
        return TestCustomException.response("Vendor updated",HttpStatus.OK,updateVendors);
    }
}
