package com.cnopens.utils;

/**
 * @ClassName: Result
 * @Description: function desc
 * @Author cnopens
 * @Date 2020/9/16 下午5:54
 * @Copyright Dashuo
 **/
public class Result {
    private int code;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result result(int code, String message, Object data) {
        return new Result(code, message, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
