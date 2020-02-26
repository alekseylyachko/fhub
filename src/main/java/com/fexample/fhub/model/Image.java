package com.fexample.fhub.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "image")
@Data
public class Image extends BaseEntity {
    @Column(name = "name")
    private String name;
}