package com.restapi.api.advice;

public class UserNotFound extends RuntimeException{

    private static final long serialVersion=1L;
    public UserNotFound(String message){
        super(message);
    }
}
