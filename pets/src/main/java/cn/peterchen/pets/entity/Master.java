package cn.peterchen.pets.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fanHB on 15-2-9.
 */
@Entity
@Table(name = "master")
public class Master extends IdEntity<Long>{

    private static final long serialVersionUID = -6214684787657857419L;
    private long rid = 0;
    private long uid;
    private String name;
    private int money = 0;

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
