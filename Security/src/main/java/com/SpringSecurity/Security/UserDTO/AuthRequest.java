package com.SpringSecurity.Security.UserDTO;

public class AuthRequest {
        private String username;
        private String password;

        // Constructors (optional for some frameworks)
        public AuthRequest() {}

        public AuthRequest(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Getters and setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


