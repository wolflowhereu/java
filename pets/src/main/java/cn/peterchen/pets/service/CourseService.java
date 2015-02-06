package cn.peterchen.pets.service;

import cn.peterchen.pets.entity.Course;
import cn.peterchen.pets.repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
@Service
public class CourseService {
    @Autowired
    private CourseDao courseDao;

    public List<Course> findAll() {
        return courseDao.findCourseAll();
    }
}
