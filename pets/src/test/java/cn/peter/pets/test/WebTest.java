package cn.peter.pets.test;

import cn.peterchen.pets.service.UserService;
import com.peterchen.core.utils.http.HttpUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testWebPost(){
        List<NameValuePair> param = new ArrayList<>();
        param.add(new BasicNameValuePair("uid", "1"));
        String result = HttpUtils.post("http://localhost:8080/api/shop/list", param);
        System.out.println(result);
    }
}
