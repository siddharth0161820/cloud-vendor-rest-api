package com.SpringSecurity.Security.GlobalExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class TestGlobalExceptionHandling {
    //Methods
    //1>
    @ExceptionHandler
    public ResponseEntity<Object>response(NOTFOUNDEXCEPTION notfoundexception){
        EntityException entityException=new EntityException(
                notfoundexception.getMessage(),
                notfoundexception.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(entityException,HttpStatus.NOT_FOUND);
    }

    //2>DTO VALIDATION
    @ExceptionHandler
    public ResponseEntity<Object>response(MethodArgumentNotValidException e){
        //create HashMap to store Error
        HashMap<Object,Object>map=new HashMap<>();
        //getting error
        e.getBindingResult().getFieldErrors().forEach((errors)->{
           map.put(errors.getField(),errors.getDefaultMessage());
        });
        return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
    }
}
