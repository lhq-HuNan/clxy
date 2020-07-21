package com.example.clxy.result;

public class WebRestResult {

    public static final int FAILURE = 0;
    public static final int SUCCESS = 1;

    private int result;
    private String message;

    public int getResult() {
        return this.result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WebRestResult{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }

}
