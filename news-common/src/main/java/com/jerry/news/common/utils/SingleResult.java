package com.jerry.news.common.utils;

/**
 * @Author： zhanlei
 * @Description：
 * @CreateTime: 16:33 2018/10/29
 * @Modified by:
 */
public class SingleResult<T> {

    private T data;

    private Integer code;

    private String message;

    private boolean result;

    public SingleResult(T data) {
        this.code = 200;
        this.message = "success";
        this.data = data;
        this.result = true;
    }

    public SingleResult(T data, Integer code, String message, boolean result) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public static <T> SingleResult<T> buildSuccess(T data) {
        return new SingleResult<T>(data);
    }

    public static <T> SingleResult<T> buildFailure() {
        return new SingleResult<T>(null, 100, "fail", false);
    }

    public static <T> SingleResult<T> buildFailure(String message) {
        return new SingleResult<T>(null, 100, message, false);
    }

    public static <T> SingleResult<T> buildFailure(T data, String message) {
        return new SingleResult<T>(data, 100, message, false);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
