package cn.peterchen.pets.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fanHB on 15-2-6.
 */
@Entity
@Table(name = "pet")
public class Pet extends IdEntity<Long>{
    private static final long serialVersionUID = 675838477462878027L;
    private long uid;
    private long rid;
    private String name;
    private int social;
    private int artistic;
    private int enterprising;
    private int realistic;
    private int conventional;
    private int investigative;
    private int level = 1;
    private int experience;
    private int speed = 1;
    private int hungry = 100;
    private int tired = 100;
    private int mood = 100;
    private int health = 100;
    private int cleaness = 100;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getArtistic() {
        return artistic;
    }

    public void setArtistic(int artistic) {
        this.artistic = artistic;
    }

    public int getEnterprising() {
        return enterprising;
    }

    public void setEnterprising(int enterprising) {
        this.enterprising = enterprising;
    }

    public int getRealistic() {
        return realistic;
    }

    public void setRealistic(int realistic) {
        this.realistic = realistic;
    }

    public int getConventional() {
        return conventional;
    }

    public void setConventional(int conventional) {
        this.conventional = conventional;
    }

    public int getInvestigative() {
        return investigative;
    }

    public void setInvestigative(int investigative) {
        this.investigative = investigative;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public int getTired() {
        return tired;
    }

    public void setTired(int tired) {
        this.tired = tired;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCleaness() {
        return cleaness;
    }

    public void setCleaness(int cleaness) {
        this.cleaness = cleaness;
    }
}
