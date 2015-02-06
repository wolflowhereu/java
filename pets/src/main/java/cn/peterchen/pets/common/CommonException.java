package cn.peterchen.pets.common;

/**
 * 全局业务异常
 */
public class CommonException extends RuntimeException {

    private int code;
    private String msg;

    public CommonException(){
    }

    public CommonException(CommonStatus status) {
        super(status.msg);
        this.code = status.code;
        this.msg = status.msg;
    }

    public CommonException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }


    public CommonException(CommonStatus commonStatus, Throwable e){
        super(e);
        this.code = commonStatus.code;
        this.msg = commonStatus.msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
