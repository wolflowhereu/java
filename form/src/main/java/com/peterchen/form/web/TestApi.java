package com.peterchen.form.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fanHB on 15-1-24.
 */
@Controller()
@RequestMapping(value = "/test")
public class TestApi {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object test() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        int i = 100/0;
        return map;
    }
}
