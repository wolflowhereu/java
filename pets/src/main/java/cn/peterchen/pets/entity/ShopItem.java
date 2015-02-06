package cn.peterchen.pets.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fanHB on 15-2-6.
 */
@Entity
@Table(name = "shop_item")
public class ShopItem  extends IdEntity<Integer> {
    private static final long serialVersionUID = 73336343632939315L;
    private String name;
    private int price;
    private int type;
    private int effect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }
}
