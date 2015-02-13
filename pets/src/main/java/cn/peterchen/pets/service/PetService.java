package cn.peterchen.pets.service;

import cn.peterchen.pets.common.WebContext;
import cn.peterchen.pets.entity.Pet;
import cn.peterchen.pets.entity.User;
import cn.peterchen.pets.repository.PetDao;
import cn.peterchen.pets.repository.UserDao;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fanHB on 15-2-9.
 */
@Service
public class PetService {

    @Autowired
    private PetDao petDao;
    @Autowired
    private UserDao userDao;

    /**
     * 新生
     * @return
     */
    public Pet born(){
        User user = WebContext.getCurrentUser();

        Pet pet = new Pet();
        pet.setName("peter");
        pet.setUid(user.getId());
        pet.setSocial(RandomUtils.nextInt(1, 10));
        pet.setArtistic(RandomUtils.nextInt(1, 10));
        pet.setEnterprising(RandomUtils.nextInt(1, 10));
        pet.setEnterprising(RandomUtils.nextInt(1, 10));
        pet.setConventional(RandomUtils.nextInt(1, 10));
        pet.setInvestigative(RandomUtils.nextInt(1, 10));
        petDao.save(pet);
        user.setPid(pet.getId());
        userDao.save(user);

        return pet;
    }

    /**
     * 重命名
     * @param name
     * @return
     */
    public Pet rename(String name){
        User user = WebContext.getCurrentUser();
        Pet pet = petDao.findOne(user.getPid());
        pet.setName(name);
        petDao.save(pet);
        petDao.save(pet);
        return pet;
    }
}
