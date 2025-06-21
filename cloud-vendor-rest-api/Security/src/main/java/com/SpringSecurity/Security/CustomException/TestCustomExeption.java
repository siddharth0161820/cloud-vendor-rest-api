package com.SpringSecurity.Security.CustomException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class TestCustomExeption extends RuntimeException{
    //Methods
    public static ResponseEntity<Object>response(
            String message,
            HttpStatus httpStatus,
            Object data
    ){
        //Create Map to store data
        Map<String,Object>map=new HashMap<>();
        map.put("Message ",message);
        map.put("HttpStatus ",HttpStatus.OK);
        map.put("Data ",data);

        return new ResponseEntity<>(map,HttpStatus.OK);
    }
}
