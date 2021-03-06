package com.fexample.fhub.dao.model.classes.User;

import com.fexample.fhub.dao.model.classes.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "c_role_table")
public class Role extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}