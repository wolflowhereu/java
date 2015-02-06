package cn.peterchen.pets.service;

import cn.peterchen.pets.entity.ShopItem;
import cn.peterchen.pets.repository.ShopItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fanHB on 15-2-6.
 */
@Service
public class ShopItemService {
    @Autowired
    private ShopItemDao shopItemDao;
    public List<ShopItem> getList(){
        return shopItemDao.findShopItem();
    }
}
