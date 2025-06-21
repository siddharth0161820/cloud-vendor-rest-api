package com.SpringSecurity.Security.ControllerLayer;

import com.SpringSecurity.Security.CutomException.TestCustomException;
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
@RequestMapping("/vendor")
public class ControllerLayer {

    //0>Connect Controller Layer to Service Layer
    @Autowired
    private ServiceLayer serviceLayer;

    //1>Methods()
      //1.0>getAllVendors
    //removed endpoint so can be accessed publically
    @GetMapping
    public List<CloudVendor>getAllVendors(){
        return this.serviceLayer.getAllVendors();
    }

    //1.1>getSingleVendors
    @GetMapping("/getSingleVendors/{id}")
    public ResponseEntity<Object> getSingleVendors(@PathVariable int id) {
        return TestCustomException.response(
                "OM NAMO PARVATI PATE HAR HAR MAHADEV",
                HttpStatus.OK,
                this.serviceLayer.getSingleVendors(id)
        );

    }
    //1.2>addVendors
    @PostMapping("/addVendors")
    public ResponseEntity<Object> addVendors(@Valid @RequestBody UserDTO userDTO){
        CloudVendor addVendor=this.serviceLayer.addVendors(userDTO);
        return TestCustomException.response("Vendor added",HttpStatus.CREATED,addVendor);


    }

    //1.3>deleteVendors
    @DeleteMapping("/deleteVendors/{id}")
    public ResponseEntity<Object> deleteVendors(@PathVariable int id){
        this.serviceLayer.deleteVendors(id);
        return TestCustomException.response(
                "Deleted",
                HttpStatus.OK,
                null
        );

    }

    //1.4>updateVendors
    @PutMapping("/updateVendors")
    public ResponseEntity<Object> updateVendors(@Valid @RequestBody UserDTO userDTO){
        CloudVendor updateVendor= this.serviceLayer.updateVendors(userDTO);

        return TestCustomException.response("Vendor updated",HttpStatus.OK,updateVendor);
    }

}
