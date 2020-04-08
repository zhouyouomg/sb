package com.zhouyou.sb.core;


public class RetResponse {

    private final static String SUCCESS = "success";

    public static <T> RetResult<T> makeOKRsp() {
        return new RetResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> RetResult<T> result(T data) {
        return new RetResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> RetResult<T> makeErrRsp(String message) {
        return new RetResult<T>().setCode(RetCode.ERROR).setMsg(SUCCESS);
    }

    public static <T> RetResult<T> result(int code, String msg) {
        return new RetResult<T>().setCode(code).setMsg(msg);
    }

    public static <T> RetResult<T> result(int code, String msg, T data) {
        return new RetResult<T>().setCode(code).setMsg(msg).setData(data);
    }
}
