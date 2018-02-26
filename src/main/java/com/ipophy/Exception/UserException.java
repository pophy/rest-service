package com.ipophy.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserException extends RuntimeException{

    private int code;
    private String msg;

    public UserException(String message) {
        super(message);
    }
}
