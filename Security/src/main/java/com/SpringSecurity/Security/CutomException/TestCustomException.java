package com.SpringSecurity.Security.CutomException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class TestCustomException {

    //0>Methods()
    public static ResponseEntity<Object>response(
            String message,
            HttpStatus httpStatus,
            Object data

    ){
        Map<String,Object>map=new HashMap<>();
        map.put("Message",message);
        map.put("HttPstatus",httpStatus);
        map.put("Data", data);
        return new ResponseEntity<>(map,HttpStatus.OK) ;
    }
}
