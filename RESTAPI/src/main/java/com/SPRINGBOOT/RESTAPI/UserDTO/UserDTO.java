package com.SPRINGBOOT.RESTAPI.UserDTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserDTO {
    //1>Attributes
    private int id;
    @NotEmpty
    @Size(min = 2, message = "Name should have at-least 2 characters")
    private String name;
    @Email
    @Size(min = 1,message = "The userName should have emailId")
    private String userName;
    @NotEmpty
    @Size(min = 2,message = "The passWord is mandatory")
    private String passWord;

    //2>Default Constructor
    public UserDTO() {
    }
    //3>Parameterized Constructor

    public UserDTO(int id, String name, String userName, String passWord) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
    }
    //4>Getter & Setter

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

    //5>toString()

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
