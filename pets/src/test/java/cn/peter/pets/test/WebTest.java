package cn.peter.pets.test;

import cn.peterchen.pets.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fanHB on 15-1-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@ActiveProfiles("development")
public class WebTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFirst(){
        userService.getUser(1);
        System.out.println("123");
    }
}
