package com.SPRINGBOOT.RESTAPI.CustomExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class TestCustomExceptionHandler {
    //1>Methods()
    public static ResponseEntity<Object>response(
            String message,
            HttpStatus httpStatus,
            Object data
    ){
        //create a Map to store response
        Map<String,Object> map=new HashMap<>();
        //Store response into the error
        map.put("Message", message);
        map.put("HttpStatus", httpStatus);
        map.put("Object", data);
        return new ResponseEntity<>(map,HttpStatus.OK) ;
    }
}
