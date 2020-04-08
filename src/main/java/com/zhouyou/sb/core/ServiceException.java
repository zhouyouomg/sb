package com.zhouyou.sb.core;

import java.io.Serializable;

public class ServiceException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1213855733833039552L;

    private String msg;
    private int code = 500;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }


    public ServiceException(String msg, Throwable e) {
        super(msg,e);
    }

    public ServiceException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public ServiceException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }
}
