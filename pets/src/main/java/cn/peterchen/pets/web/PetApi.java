package cn.peterchen.pets.web;

import cn.peterchen.pets.entity.Pet;
import cn.peterchen.pets.service.PetService;
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
@RequestMapping(value = "/api/pet", consumes = MediaType.ALL_VALUE)
public class PetApi {

    @Autowired
    private PetService petService;


    @RequestMapping(value = "/born")
    @ResponseBody
    public Response register() {
        Pet pet = petService.born();

        Response<Pet> response = new Response<>();
        response.setResult(pet);
        return response;
    }

    @RequestMapping(value = "/rename")
    @ResponseBody
    public Response rename(String name){
        Pet pet = petService.rename(name);
        Response<Pet> response = new Response<>();
        response.setResult(pet);
        return response;
    }
}
