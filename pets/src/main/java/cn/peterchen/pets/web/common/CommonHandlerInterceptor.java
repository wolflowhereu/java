package cn.peterchen.pets.web.common;

import cn.peterchen.pets.common.CommonException;
import cn.peterchen.pets.common.CommonStatus;
import cn.peterchen.pets.entity.User;
import cn.peterchen.pets.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


/**
 * 全局拦截器,进行用户认证和接口访问记录
 */
@ControllerAdvice
public class CommonHandlerInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String servletPath = request.getServletPath();
        StringBuffer sb = new StringBuffer();
        sb.append(servletPath+"?");
        Map<String, String[]> map = request.getParameterMap();
        for(String key : map.keySet()){
            sb.append(key+"=" +map.get(key));
        }
        System.out.println(servletPath+sb.toString());
        request.setAttribute("param", servletPath+sb.toString());
        //默认
        if (!StringUtils.startsWith(servletPath, "/api") || StringUtils.equals(servletPath, "/api/user/register")) {
            return super.preHandle(request, response, handler);
        }

        CommonException commonException = new CommonException(CommonStatus.AUTH_ERROR);
        try {
            long uid = NumberUtils.toLong(request.getParameter("uid"));
            User user = userService.getUser(uid);
            if (user != null) {
                request.setAttribute("user", user);
                return super.preHandle(request, response, handler);
            }
        } catch (Exception e) {
            commonException = new CommonException(CommonStatus.FAILED, e);
        }

        request.setAttribute("commonException", commonException);

        request.getRequestDispatcher("/error").forward(request, response);
        return false;

    }

}
