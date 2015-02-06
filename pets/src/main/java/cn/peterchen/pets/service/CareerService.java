package cn.peterchen.pets.service;

import cn.peterchen.pets.entity.Career;
import cn.peterchen.pets.repository.CareerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
@Service
public class CareerService {
    @Autowired
    private CareerDao careerDao;

    public List<Career> findAll(){
        return careerDao.findCareer();
    }
}
