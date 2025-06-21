package com.SpringSecurity.Security.ServiceLayer;

import com.SpringSecurity.Security.Entity.CloudVendor;
import com.SpringSecurity.Security.GlobalExceptionHandling.NOTFOUNDEXCEPTION;
import com.SpringSecurity.Security.RepositoryLayer.RepositoryLayer;
import com.SpringSecurity.Security.UserDTO.UserDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) //  mock initialization
public class ServiceLayerImplementationTest {

    @Mock
    private RepositoryLayer repositoryLayer;

    @InjectMocks
    private ServiceLayerImplementation serviceLayerImplementation;


    @Test
    public void testAddVendor_Success() {
        // Arrange
        UserDTO userDTO = new UserDTO(1, "testName", "testUsername", "password");
        CloudVendor expectedVendor = new CloudVendor(1, "testName", "testUsername", "password");

        // Mock behavior
        when(repositoryLayer.save(any(CloudVendor.class))).thenReturn(expectedVendor);

        // Act
        CloudVendor result = serviceLayerImplementation.addVendors(userDTO);

        // Assert
        assertNotNull(result);
        assertEquals("testUsername", result.getUsername());
        assertEquals("testName", result.getName());
    }

    //Test for getSingleVendor(int id)that includes positive ans negative testing using junit+mockito
       //positive tests-vendor exists in Database
     @Test
    public void testGetSingleVendor_Success(){
            //Arrange
        int vendorId=21;
        CloudVendor mockVendor=new CloudVendor(21,"testName","testUsername","testPassword");

        //Mock repo to return vendor
        when(repositoryLayer.findById(vendorId)).thenReturn(Optional.of(mockVendor));

        // Act
        CloudVendor result = serviceLayerImplementation.getSingleVendors(vendorId);

        // Assert
        assertNotNull(result);
        assertEquals("testName", result.getName());
        assertEquals("testUsername", result.getUsername());


    }
    //Negative path
    @Test
    public void testGetSingleVendor_NotFound() {
        // Arrange
        int invalidVendorId = 99;

        // Mock repository to return empty
        when(repositoryLayer.findById(invalidVendorId)).thenReturn(Optional.empty());

        // Act & Assert
        NOTFOUNDEXCEPTION thrown = assertThrows(
                NOTFOUNDEXCEPTION.class,
                () -> serviceLayerImplementation.getSingleVendors(invalidVendorId)
        );

        assertEquals("Please enter the valid input to get the single vendor details", thrown.getMessage());
    }

}
