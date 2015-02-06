package cn.peterchen.pets.service;

import cn.peterchen.pets.entity.User;
import cn.peterchen.pets.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fanHB on 15-1-28.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User register(){
        User user = new User();
        user.setUsername(":hh");
        userDao.save(user);
        return user;
    }

    public User updateUserName(String name, long uid){
        User user = userDao.findOne(uid);
        user.setUsername(name);
        userDao.save(user);
        return user;
    }

    public User getUser(long uid){
        return userDao.findOne(uid);
    }

}
