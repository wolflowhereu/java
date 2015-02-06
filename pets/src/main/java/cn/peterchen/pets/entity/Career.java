package cn.peterchen.pets.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fanHB on 15-2-6.
 */
@Entity
@Table(name = "career")
public class Career extends IdEntity<Integer>{
    private static final long serialVersionUID = 1349428323151100291L;
    private String name;
    private int level;
    private int salary;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
