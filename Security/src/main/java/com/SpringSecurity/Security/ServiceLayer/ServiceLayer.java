package com.SpringSecurity.Security.ServiceLayer;

import com.SpringSecurity.Security.Entity.CloudVendor;
import com.SpringSecurity.Security.UserDTO.UserDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ServiceLayer {

    public List<CloudVendor> getAllVendors();
    public CloudVendor getSingleVendor( int id);
    public CloudVendor addVendor(UserDTO userDTO);
    public void deleteVendor(int id);
    public CloudVendor updateVendor( UserDTO userDTO);
}
