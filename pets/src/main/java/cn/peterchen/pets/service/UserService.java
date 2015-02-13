package cn.peterchen.pets.service;

import cn.peterchen.pets.common.WebContext;
import cn.peterchen.pets.entity.Master;
import cn.peterchen.pets.entity.User;
import cn.peterchen.pets.repository.MasterDao;
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
    @Autowired
    private MasterDao masterDao;


    public User register(){
        User user = new User();
        user.setUsername(":hh");
        userDao.save(user);
        return user;
    }

    public User modifyBaseInfo(String name, int gender){
        User user = WebContext.getCurrentUser();
        user.setUsername(name);
        user.setGender(gender);
        if (user.getMid()<=0){
            Master master = new Master();
            master.setName(name);
            master.setUid(user.getId());
            masterDao.save(master);
            user.setMid(master.getId());
        }
        userDao.save(user);
        return user;
    }

    public User getUser(long uid){
        return userDao.findOne(uid);
    }

}
