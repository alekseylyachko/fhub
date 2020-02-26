package com.fexample.fhub.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data
public class Category extends BaseEntity {
    @Column(name = "name")
    private String name;
}