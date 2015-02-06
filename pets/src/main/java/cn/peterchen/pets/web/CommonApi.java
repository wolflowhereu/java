package cn.peterchen.pets.web;

import cn.peterchen.pets.common.CommonException;
import cn.peterchen.pets.common.CommonStatus;
import cn.peterchen.pets.web.common.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created by fanHB on 15-1-30.
 */
@Controller
public class CommonApi{

    @RequestMapping(value = "/error")
    @ResponseBody
    public Response error() {
        CommonException commonException = (CommonException)RequestContextHolder.getRequestAttributes().
                getAttribute("commonException", RequestAttributes.SCOPE_REQUEST);
        if (commonException==null){
            throw new CommonException(CommonStatus.FAILED);
        }
        throw commonException;
    }
}
