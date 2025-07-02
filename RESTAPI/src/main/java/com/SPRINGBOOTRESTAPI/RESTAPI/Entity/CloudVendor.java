package com.SPRINGBOOTRESTAPI.RESTAPI.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="CloudVendorData")
public class CloudVendor {
    //0>Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String userName;
    private String passWord;

    //1>Default Constructor
    public CloudVendor() {
    }

    //2>Parameterized Constructor

    public CloudVendor(int id, String name, String userName, String passWord) {
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
