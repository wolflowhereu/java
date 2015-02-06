package cn.peterchen.pets.web;

import cn.peterchen.pets.entity.Career;
import cn.peterchen.pets.service.CareerService;
import cn.peterchen.pets.web.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
@Controller
@RequestMapping("/api/career")
public class CareerApi {


    @Autowired
    private CareerService careerService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public Response getList() {
        Response<List<Career>> response = new Response<>();
        response.setResult(careerService.findAll());
        return response;
    }
}
