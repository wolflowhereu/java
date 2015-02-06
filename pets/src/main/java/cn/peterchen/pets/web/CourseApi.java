package cn.peterchen.pets.web;

import cn.peterchen.pets.entity.Course;
import cn.peterchen.pets.repository.CourseDao;
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
@RequestMapping("/api/course")
public class CourseApi {

    @Autowired
    private CourseDao courseDao;

    @RequestMapping(value = "/list")
    @ResponseBody
    public Response getCourseList() {
        Response<List<Course>> response = new Response<>();
        response.setResult(courseDao.findCourseAll());
        return response;
    }
}
