package com.netflixclone.netflixclone.exception;

public class EmailNotVerifiedException extends  RuntimeException {
    public EmailNotVerifiedException(String message){
        super(message);
    }
}
