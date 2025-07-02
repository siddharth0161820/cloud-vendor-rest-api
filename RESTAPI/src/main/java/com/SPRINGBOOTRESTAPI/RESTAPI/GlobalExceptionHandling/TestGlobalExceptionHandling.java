package com.SPRINGBOOTRESTAPI.RESTAPI.GlobalExceptionHandling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class TestGlobalExceptionHandling {
    //0>Methods()
    @ExceptionHandler
    public ResponseEntity<Object>response(NOTFOUNDEXCEPTION notfoundexception){
        EntityException entityException=new EntityException(
                notfoundexception.getMessage(),
                notfoundexception.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(entityException,HttpStatus.NOT_FOUND);
    }

    //1>Method()-1
    @ExceptionHandler
    public ResponseEntity<Object>response(MethodArgumentNotValidException e){
        //Create Map to store error
        Map<String,Object>map=new HashMap<>();
        //store error
        e.getBindingResult().getFieldErrors().forEach((errors)->{
            map.put(errors.getField(),errors.getDefaultMessage());
        });
        return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
    }
}
