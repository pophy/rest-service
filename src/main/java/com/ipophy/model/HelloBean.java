package com.ipophy.model;

/**
 * Created by fei on 2/25/18.
 */
public class HelloBean {


    private String message;
    private int id;
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;

    }

    public HelloBean(String s, int id) {
        this.message = s;
        this.id = id;
        data = "data";
    }
}
