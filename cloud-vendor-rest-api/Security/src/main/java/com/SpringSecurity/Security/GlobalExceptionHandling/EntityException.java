package com.SpringSecurity.Security.GlobalExceptionHandling;

import org.springframework.http.HttpStatus;

public class EntityException {
    //0>Attributes
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    //1>constructor

    public EntityException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    //2>Getter

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
