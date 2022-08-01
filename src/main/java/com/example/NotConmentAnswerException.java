package com.example;

/**
 * @author weepppp 2022/8/1 21:15
 * 自定义异常类
 **/
public class NotConmentAnswerException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private ResponseEnum responseEnum;
    private Object object;

    public NotConmentAnswerException(String message) {
        super(message);
    }

    public NotConmentAnswerException(String message, Object object) {
        super(message);
        this.object = object;
    }

    public NotConmentAnswerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotConmentAnswerException(ResponseEnum responseEnum) {
        super(responseEnum.getMsg());
        this.responseEnum = responseEnum;
    }

    public NotConmentAnswerException(ResponseEnum responseEnum, Object object) {
        super(responseEnum.getMsg());
        this.responseEnum = responseEnum;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }
}
