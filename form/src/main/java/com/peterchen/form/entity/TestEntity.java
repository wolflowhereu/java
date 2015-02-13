package com.peterchen.form.entity;

import javax.persistence.*;

/**
 * Created by fanHB on 15-1-24.
 */
@Entity
@Table(name = "test")
public class TestEntity {


    private long id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
