package cn.peterchen.pets.common;


import org.springframework.http.HttpStatus;

/**
 * api业务请求状态
 */
public enum CommonStatus {


    FAILED(10001, "服务器异常"),

    VISIT_ERROR(10002, "请求头错误"),

    AUTH_ERROR(HttpStatus.UNAUTHORIZED.value(), "身份验证失败"),

    PARAM_ERROR(HttpStatus.BAD_REQUEST.value(), "参数错误%s"),

    SUCCESS(1, "成功");

    public final int code;

    public final String msg;


    private CommonStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }



}
