package cn.peterchen.pets.web.common;

import cn.peterchen.pets.common.CommonException;
import cn.peterchen.pets.common.CommonStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理全局业务异常CommonException
 */
@ControllerAdvice
class CommonExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(CommonHandlerInterceptor.class);

    @ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public Response handleException(CommonException exception) {
        logger.warn(exception.getMsg(), exception);
        Response<Throwable> response = new Response();
        response.setCode(exception.getCode());
        response.setMsg(exception.getMsg());
        response.setResult(exception);
        return response;
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handleException(Exception exception) {
        logger.error("服务器严重错误", exception);
        Response<Throwable> response = new Response();
        response.setCode(CommonStatus.FAILED.code);
        response.setMsg(CommonStatus.FAILED.msg);
        response.setResult(exception);
        return response;
    }

}
