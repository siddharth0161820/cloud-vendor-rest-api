package com.SPRINGBOOTRESTAPI.RESTAPI.UserDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {
    private int id;
    @NotEmpty
    @Size(min = 2,message = "Name should have at-least 2 characters")
    private String name;
    @Email(message = "userName should not be empty")
    private String userName;
    @NotNull
    @Size(min = 3,message = "passWord is mandatory for security purpose")
    private String passWord;

    //1>Default Constructor
    public UserDTO() {
    }

    //2>Parameterized Constructor

    public UserDTO(int id, String name, String userName, String passWord) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    //4>toString()

    @Override
    public String toString() {
        return "CloudVendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
