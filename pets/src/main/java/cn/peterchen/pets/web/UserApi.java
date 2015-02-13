package cn.peterchen.pets.web;

import cn.peterchen.pets.common.WebContext;
import cn.peterchen.pets.entity.User;
import cn.peterchen.pets.service.UserService;
import cn.peterchen.pets.web.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanHB on 15-1-28.
 */
@Controller
@RequestMapping("/api/user")
public class UserApi {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register")
    @ResponseBody
    public Response register() {
        User user = userService.register();

        Response<User> response = new Response<>();
        response.setResult(user);
        return response;
    }

    @RequestMapping(value = "/modifyBaseInfo")
    @ResponseBody
    public Response modifyBaseInfo(String name, int gender) {

        User user = userService.modifyBaseInfo(name, gender);
        Response<User> response = new Response<>();
        response.setResult(user);
        return response;

    }

    @RequestMapping(value = "/getInitData")
    @ResponseBody
    public Response getInitData(){
return null;
    }


}
