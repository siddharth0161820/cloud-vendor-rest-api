package com.SpringSecurity.Security.GlobalExceptionHandling;

public class NOTFOUNDEXCEPTION extends RuntimeException{
    //0>Constructor


    public NOTFOUNDEXCEPTION(String message) {
        super(message);
    }

    public NOTFOUNDEXCEPTION(String message, Throwable cause) {
        super(message, cause);
    }
}
