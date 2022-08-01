package com.example;

/**
 * @author weepppp 2022/8/1 21:19
 * 自定义返回状态码类型
 **/
public enum ResponseEnum {

    /**
     * ok
     */
    OK("00000", "ok"),

    /**
     * 数据异常
     */
    DATA_ERROR("A00007", "数据异常，请刷新后重新操作");

    private final String code;
    private final String msg;

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseEnum{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                "} " + super.toString();
    }

    public String value() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
