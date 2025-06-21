package com.SpringSecurity.Security.ControllerLayer;

import com.SpringSecurity.Security.UserDTO.AuthRequest;
import com.SpringSecurity.Security.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    // POST /auth/login
    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        try {
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );

            if (auth.isAuthenticated()) {
                return jwtUtil.generateToken(request.getUsername());
            } else {
                throw new RuntimeException("Invalid Access");
            }

        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid Credentials");
        }
    }

}
