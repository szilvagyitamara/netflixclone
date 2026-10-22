package com.netflixclone.netflixclone.exception;

public class BadCredentialsException extends  RuntimeException {
    public BadCredentialsException(String message){
        super(message);
    }
}
