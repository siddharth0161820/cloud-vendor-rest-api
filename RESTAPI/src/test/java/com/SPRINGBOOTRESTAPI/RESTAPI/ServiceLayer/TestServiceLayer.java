package com.SPRINGBOOTRESTAPI.RESTAPI.ServiceLayer;

import com.SPRINGBOOTRESTAPI.RESTAPI.Entity.CloudVendor;
import com.SPRINGBOOTRESTAPI.RESTAPI.GlobalExceptionHandling.NOTFOUNDEXCEPTION;
import com.SPRINGBOOTRESTAPI.RESTAPI.RepositoryLayer.RepositoryLayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

//  Import static methods for assertions and Mockito behavior
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

/**
 * Unit test class for ServiceLayerImplementation
 *  Uses Mockito to mock RepositoryLayer
 * 🧪 Uses JUnit 5 for test cases
 */
public class TestServiceLayer {

    //  Create a fake version of the Repository (mocked DB)
    @Mock
    private RepositoryLayer repositoryLayer;

    //  Inject the real service class, with the above mock injected inside
    @InjectMocks
    private ServiceLayerImplementation serviceLayerImplementation;

    /**
     *  Setup method runs before each test
     * Initializes all mocks (@Mock, @InjectMocks)
     */
    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this); // Mockito bootstrapping
    }

    /**
     * TEST CASE 1: Get single vendor that exists
     * - Mocks repository to return a real vendor object
     * - Checks that service returns correct name
     */
    @Test
    public void testGetSingleVendor_WhenExists() {
        // Arrange - create dummy vendor data
        CloudVendor vendor = new CloudVendor(1, "NilKanthParvati", "Mahadev@gmail.com", "ShivShakti");

        // Act - mock the repo behavior
        when(repositoryLayer.findById(1)).thenReturn(Optional.of(vendor));

        // Call the actual service method
        CloudVendor result = serviceLayerImplementation.getSingleVendors(1);

        // Assert - validate returned object
        assertNotNull(result); // Ensure not null
        assertEquals("NilKanthParvati", result.getName(), "Vendor name did not match");
    }

    /**
     *  TEST CASE 2: Get vendor by ID that does not exist
     * - Mocks empty result from repository
     * - Expects NOTFOUNDEXCEPTION to be thrown
     */
    @Test
    public void testGetSingleVendor_WhenNotExists() {
        // Act - simulate repo returns nothing
        when(repositoryLayer.findById(2)).thenReturn(Optional.empty());

        // Assert - exception should be thrown
        assertThrows(NOTFOUNDEXCEPTION.class, () -> {
            serviceLayerImplementation.getSingleVendors(2);
        });
    }

    /**
     * TEST CASE 3: Delete vendor that exists
     * - Mocks repository to return valid vendor
     * - Verifies that deleteById was called exactly once
     */
    @Test
    public void testDeleteVendor_WhenExists() {
        // Arrange - mock vendor present
        CloudVendor vendor = new CloudVendor(3, "ShivParvati", "shiv@parvati.com", "Mahadev");

        // Act - mock repo response
        when(repositoryLayer.findById(3)).thenReturn(Optional.of(vendor));

        // Call service method
        serviceLayerImplementation.deleteVendors(3);

        // Assert - verify deleteById was invoked
        verify(repositoryLayer, times(1)).deleteById(3);
    }

    /**
     * TEST CASE 4: Delete vendor that does not exist
     * - Mocks repository to return empty Optional
     * - Expects NOTFOUNDEXCEPTION to be thrown
     */
    @Test
    public void testDeleteVendor_WhenNotExists() {
        // Act - mock empty repo response
        when(repositoryLayer.findById(99)).thenReturn(Optional.empty());

        // Assert - exception expected
        assertThrows(NOTFOUNDEXCEPTION.class, () -> {
            serviceLayerImplementation.deleteVendors(99);
        });
    }
}
