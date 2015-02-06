package cn.peterchen.pets.repository;

import cn.peterchen.pets.entity.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fanHB on 15-2-6.
 */
public interface PetDao extends CrudRepository<Pet, Long> {
}
