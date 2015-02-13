package cn.peterchen.pets.service;

import cn.peterchen.pets.common.WebContext;
import cn.peterchen.pets.entity.Master;
import cn.peterchen.pets.entity.User;
import cn.peterchen.pets.repository.MasterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fanHB on 15-2-9.
 */
@Service
public class MasterService {

    @Autowired
    private MasterDao masterDao;

    /**
     * 重命名
     * @param name
     * @return
     */
    public Master rename(String name){
        User user = WebContext.getCurrentUser();
        Master master = masterDao.findOne(user.getMid());
        master.setName(name);
        masterDao.save(master);
        return master;
    }

}
