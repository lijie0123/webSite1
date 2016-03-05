package com.lijie.webSite1.model.exception;

/**
 * Created by lj on 16-3-6.
 */
public class WebExeption extends Exception{
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public WebExeption(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public WebExeption(int code) {
        this.code = code;
        this.msg = null;
    }

    @Override
    public String toString() {
        return "WebExeption{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
