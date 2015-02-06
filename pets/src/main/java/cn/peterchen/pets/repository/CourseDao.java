package cn.peterchen.pets.repository;

import cn.peterchen.pets.entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
public interface CourseDao extends CrudRepository<Course, Integer> {
    @Query("select t from Course t")
    public List<Course> findCourseAll();
}
