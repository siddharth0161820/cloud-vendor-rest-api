package com.SpringSecurity.Security.ControllerLayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllerLayer {
    @GetMapping("/")
    public String home() {
        return " Welcome to Cloud Vendor REST API! Use /vendor to access the API.";
    }
}
