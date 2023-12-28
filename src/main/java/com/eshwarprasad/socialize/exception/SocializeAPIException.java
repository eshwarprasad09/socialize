package com.eshwarprasad.socialize.exception;

import org.springframework.http.HttpStatus;

public class SocializeAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public SocializeAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public SocializeAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
