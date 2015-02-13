package cn.peterchen.pets.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fanHB on 15-1-28.
 */
@Entity
@Table(name = "user")
public class User extends IdEntity<Long>{

    private static final long serialVersionUID = -8365040918627886802L;
    private long pid;
    private long mid;
    private int gender;
    private String username;

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
