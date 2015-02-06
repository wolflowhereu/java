package com.wolflowhereu.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fanHB on 15-1-26.
 */
@Controller()
public class ApiMain {


    @RequestMapping(value = "test")
    @ResponseBody
    public Object test() {
        System.out.println("test");
        Map<String, String> test = new HashMap<>();
        test.put("title","趁我们都还年轻");
        test.put("image","images/s5.jpg");
        test.put("content","趁我们都还年轻,多走几步路，多欣赏下沿途的风景，不要急于抵达目的地而错过了流年里温暖的人和物；趁我们都还年轻，多说些浪漫的话语，多做些幼稚的事情，不要嫌人笑话错过了生命中最美好的片段和场合；趁我们都还年轻，把距离缩短，把时间延长。趁我们都还年轻，多做些我们想要做的任何事...");
        test.put("time","2013-8-7");

        List<Object> result = new ArrayList<>();
        result.add(test);
        result.add(test);
        result.add(test);
        result.add(test);
        result.add(test);
        result.add(test);
        result.add(test);
        result.add(test);
        result.add(test);
        return result;
    }



    @RequestMapping(value = "test500")
    @ResponseBody
    public Object testError() {
        System.out.println("test");
        int i=100/0;
        return i;
    }
}
