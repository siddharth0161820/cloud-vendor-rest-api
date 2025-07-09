package com.SPRINGBOOT.RESTAPI.ControllerLayer;

import com.SPRINGBOOT.RESTAPI.CustomExceptionHandler.TestCustomExceptionHandler;
import com.SPRINGBOOT.RESTAPI.Entity.CloudVendor;
import com.SPRINGBOOT.RESTAPI.ServiceLayer.ServiceLayer;
import com.SPRINGBOOT.RESTAPI.UserDTO.UserDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerLayer {
     //1>Connect Controller Layer to service Layer via constructor injection
     private final ServiceLayer serviceLayer;

    public ControllerLayer(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }
    //2>Methods()
    //2.1>getAllVendors
    @GetMapping("/getAllVendors")
    public List<CloudVendor>getAllVendors(){
        return this.serviceLayer.getAllVendors();
    }
    //2.2>getSingleVendors
    @GetMapping("/getSingleVendors/{id}")
    public ResponseEntity<Object> getSingleVendors(@PathVariable int id){
       return TestCustomExceptionHandler.response(
               "Single Vendor Details Extracted",
               HttpStatus.OK,
               this.serviceLayer.getSingleVendors(id)
        );
    }
    //2.3>addVendors
    @PostMapping("/addVendors")
    public ResponseEntity<Object> addVendors(@Valid @RequestBody UserDTO userDTO){
        CloudVendor addVendors=this.serviceLayer.addVendors(userDTO);
        return TestCustomExceptionHandler.response("Vendor details added",HttpStatus.CREATED,addVendors);
    }

    //2.4>updateVendors
    @PutMapping("/updateVendors")
    public ResponseEntity<Object> updateVendors(@Valid @RequestBody UserDTO userDTO){
       CloudVendor updateVendors= this.serviceLayer.updateVendors(userDTO);
       return TestCustomExceptionHandler.response("Vendor details updated",HttpStatus.OK,updateVendors);
    }
    //2.5>deleteVendors
    @DeleteMapping("/deleteVendors/{id}")
    public ResponseEntity<Object>deleteVendors(@PathVariable int id){
        this.serviceLayer.deleteVendors(id);
        return TestCustomExceptionHandler.response(
                "Single Vendor Details deleted",
                HttpStatus.OK,
               null
        );

    }
}
