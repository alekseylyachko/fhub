package com.fexample.fhub.dao.model.classes.Store;

import com.fexample.fhub.dao.model.classes.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "c_ingridient_table")
public class Ingridient extends BaseEntity {
    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}