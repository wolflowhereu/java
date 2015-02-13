package cn.peterchen.pets.web;

import cn.peterchen.pets.entity.Master;
import cn.peterchen.pets.service.MasterService;
import cn.peterchen.pets.web.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanHB on 15-2-9.
 */
@Controller
@RequestMapping(value = "/api/master", consumes = MediaType.ALL_VALUE)
public class MasterApi {

    @Autowired
    private MasterService masterService;

    @RequestMapping(value = "/rename")
    @ResponseBody
    public Response rename(String name) {
        Master master = masterService.rename(name);
        Response<Master> response = new Response<>();
        response.setResult(master);
        return response;
    }
}
