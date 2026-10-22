package com.netflixclone.netflixclone.exception;

public class InvalidTokenException extends  RuntimeException {
    public InvalidTokenException(String message){
        super(message);
    }
}
