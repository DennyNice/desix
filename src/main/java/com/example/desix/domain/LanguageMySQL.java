package com.example.desix.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "language")
public class LanguageMySQL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Id must be always LONG
    private Long id;

    private String name;
    private String creator;
    private String feature;

    public LanguageMySQL(){
    }

    public LanguageMySQL(String name, String creator, String feature) {
        this.name = name;
        this.creator = creator;
        this.feature = feature;
    }
}