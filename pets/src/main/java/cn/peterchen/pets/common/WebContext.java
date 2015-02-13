package cn.peterchen.pets.common;

import cn.peterchen.pets.entity.User;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by fanHB on 15-2-9.
 */

public class WebContext {
    /**
     * 获取当前用户
     * @return
     */
    public static User getCurrentUser(){
        return (User)RequestContextHolder.getRequestAttributes().getAttribute("user", RequestAttributes.SCOPE_REQUEST);
    }
}
