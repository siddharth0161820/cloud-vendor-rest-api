package com.SpringSecurity.Security.UserDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {
     @NotNull(message = "Id should be primary key")
    private int id;
     @NotBlank
     @Size(min = 3,message = "Name should have at-least  3 characters")
    private String name;
     @Email(message = "Please,provide the valid mail id")
    private String email;
     @NotNull
     @Size(min = 4,message = "Password should be strong")
    private String password;

    //1>Default Constructor
    public UserDTO() {
    }

    //2>Parameterized constructor
    public UserDTO(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //3>Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //4>toString()

    @Override
    public String toString() {
        return "CloudVendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
