package cn.peterchen.pets.web;

import cn.peterchen.pets.entity.ShopItem;
import cn.peterchen.pets.service.ShopItemService;
import cn.peterchen.pets.web.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
@Controller
@RequestMapping(value = "/api/shop", consumes = MediaType.ALL_VALUE)
public class ShopItemApi {

    @Autowired
    private ShopItemService shopItemService;
    @RequestMapping(value = "/list")
    @ResponseBody
    public Response getList() {
        Response<List<ShopItem>> response = new Response<>();
        response.setResult(shopItemService.getList());
        return response;
    }
}
