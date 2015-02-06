package cn.peterchen.pets.web.common;

import cn.peterchen.pets.common.CommonException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanHB on 15-1-30.
 */
public class BaseApi {
    @ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public Object handleException(CommonException exception) {
        exception.printStackTrace();

        System.out.println("CommonException exception");
        return "CommonException exception";
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handleException(Exception exception) {

        System.out.println("Exception exception");
        exception.printStackTrace();
        return "Exception exception";
    }
}
