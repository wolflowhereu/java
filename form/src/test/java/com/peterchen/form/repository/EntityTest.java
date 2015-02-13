package com.peterchen.form.repository;

import com.peterchen.core.utils.JsonMapper;
import com.peterchen.form.entity.TestEntity;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fanHB on 15-1-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@ActiveProfiles("test")
public class EntityTest {

    @Autowired
    private TestEntityDao testEntityDao;

    @Test
    public void springTest(){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(1);
        testEntity.setName("test");
        testEntityDao.save(testEntity);

        System.out.println(JsonMapper.nonDefaultMapper().toJson(testEntityDao.findOne(1l)));
    }

    @Test
    public void testTime(){
        DateTime dateTime = DateTime.now();
        System.out.println(dateTime);
    }
}
