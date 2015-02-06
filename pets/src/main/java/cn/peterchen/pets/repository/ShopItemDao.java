package cn.peterchen.pets.repository;

import cn.peterchen.pets.entity.ShopItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
public interface ShopItemDao extends CrudRepository<ShopItem, Integer>{
    @Query("select t from ShopItem t")
    public List<ShopItem> findShopItem();
}
