package com.SPRINGBOOT.RESTAPI.ServiceLayer;

import com.SPRINGBOOT.RESTAPI.Entity.CloudVendor;
import com.SPRINGBOOT.RESTAPI.UserDTO.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ServiceLayer {

    public List<CloudVendor> getAllVendors();
    public CloudVendor getSingleVendors( int id);
    public CloudVendor updateVendors( UserDTO userDTO);
    public void deleteVendors( int id);
    public CloudVendor addVendors(UserDTO userDTO);
}
