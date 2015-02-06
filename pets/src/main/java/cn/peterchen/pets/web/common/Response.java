package cn.peterchen.pets.web.common;

import cn.peterchen.pets.common.CommonStatus;

/**
 * Created by fanHB on 15-1-28.
 */
public class Response<T> {
    private int code;
    private String msg;
    private T result;

    public Response(){
        this.code = CommonStatus.SUCCESS.code;
        this.msg = CommonStatus.SUCCESS.msg;
    }

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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
