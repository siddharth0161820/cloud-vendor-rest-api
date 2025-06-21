package com.SpringSecurity.Security.ServiceLayer;


import com.SpringSecurity.Security.Entity.CloudVendor;
import com.SpringSecurity.Security.UserDTO.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ServiceLayer {

    public List<CloudVendor> getAllVendors();
    public CloudVendor getSingleVendors( int id);
    public  CloudVendor addVendors(UserDTO userDTO);
    public void deleteVendors( int id);
    public CloudVendor updateVendors( UserDTO userDTO);
}
