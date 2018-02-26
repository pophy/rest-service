package com.ipophy.Exception;


import java.util.Date;

public class ExceptionResponse {

    private Date timestamp;
    private String message;
    private int code;

    public ExceptionResponse(int code, String message) {
        this.timestamp = new Date();
        this.message = message;
        this.code = code;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
