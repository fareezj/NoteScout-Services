package com.wolf.noteScout.model;

public class ResponseBody {

    private String message;

    public ResponseBody() {}

    public ResponseBody(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
