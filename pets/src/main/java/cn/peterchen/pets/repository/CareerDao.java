package cn.peterchen.pets.repository;

import cn.peterchen.pets.entity.Career;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
public interface CareerDao extends CrudRepository<Career, Integer> {
    @Query("select t from Career t")
    public List<Career> findCareer();
}
