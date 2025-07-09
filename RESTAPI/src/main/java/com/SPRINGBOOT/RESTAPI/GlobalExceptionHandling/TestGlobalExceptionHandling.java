package com.SPRINGBOOT.RESTAPI.GlobalExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class TestGlobalExceptionHandling {
    //1>Methods()
    @ExceptionHandler
    public ResponseEntity<Object>response(NOTFOUNDEXCEPTION notfoundexception){
        EntityException entityException=new EntityException(
                notfoundexception.getMessage(),
                notfoundexception.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(entityException,HttpStatus.NOT_FOUND) ;
    }

    //2>Methods()
    @ExceptionHandler
    public ResponseEntity<Object>response(MethodArgumentNotValidException e){
        //Create a Map to store the Errors
        Map<String,Object>map=new HashMap<>();
        //Store Error into the Map
        e.getBindingResult().getFieldErrors().forEach((errors)->{
            map.put(errors.getField(),errors.getDefaultMessage());
        });
        return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST) ;
    }
}
