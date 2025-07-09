package com.SPRINGBOOT.RESTAPI.ServiceLayer;

import com.SPRINGBOOT.RESTAPI.Entity.CloudVendor;
import com.SPRINGBOOT.RESTAPI.GlobalExceptionHandling.NOTFOUNDEXCEPTION;
import com.SPRINGBOOT.RESTAPI.RepositoryLayer.RepositoryLayer;
import com.SPRINGBOOT.RESTAPI.UserDTO.UserDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestServiceLayer {

    @Mock
    private RepositoryLayer repositoryLayer;

    @InjectMocks
    private ServiceLayerImplementation serviceLayerImplementation;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test //Positive flow
    public void testGetSingleVendor_WhenExists() {
        CloudVendor vendor = new CloudVendor(1, "NilKanthParvati", "Mahadev@gmail.com", "ShivShakti");
        when(repositoryLayer.findById(1)).thenReturn(Optional.of(vendor));
        CloudVendor result = serviceLayerImplementation.getSingleVendors(1);
        assertNotNull(result);
        assertEquals("NilKanthParvati", result.getName());
    }

    @Test //Negative flow
    public void testGetSingleVendor_WhenNotExists() {
        when(repositoryLayer.findById(2)).thenReturn(Optional.empty());
        assertThrows(NOTFOUNDEXCEPTION.class, () -> {
            serviceLayerImplementation.getSingleVendors(2);
        });
    }

    @Test  //Positive flow
    public void testDeleteVendor_WhenExists() {
        CloudVendor vendor = new CloudVendor(3, "ShivParvati", "shiv@parvati.com", "Mahadev");
        when(repositoryLayer.findById(3)).thenReturn(Optional.of(vendor));
        serviceLayerImplementation.deleteVendors(3);
        verify(repositoryLayer, times(1)).deleteById(3);
    }

    @Test   //Negative flow
    public void testDeleteVendor_WhenNotExists() {
        when(repositoryLayer.findById(99)).thenReturn(Optional.empty());
        assertThrows(NOTFOUNDEXCEPTION.class, () -> {
            serviceLayerImplementation.deleteVendors(99);
        });
    }

    @Test
    public void testAddVendor() {
        CloudVendor vendor = new CloudVendor(10, "Ramji", "ram@gmail.com", "sitaram");
        when(repositoryLayer.save(any(CloudVendor.class))).thenReturn(vendor);
        CloudVendor saved = serviceLayerImplementation.addVendors(
                new UserDTO(10, "Ramji", "ram@gmail.com", "sitaram"));
        assertNotNull(saved);
        assertEquals("Ramji", saved.getName());
        verify(repositoryLayer, times(1)).save(any(CloudVendor.class));
    }
}
