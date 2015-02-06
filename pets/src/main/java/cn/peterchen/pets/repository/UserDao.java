package cn.peterchen.pets.repository;

import cn.peterchen.pets.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fanHB on 15-1-28.
 */
public interface UserDao extends CrudRepository<User, Long>{
//    public User findByToken(String token);
}
