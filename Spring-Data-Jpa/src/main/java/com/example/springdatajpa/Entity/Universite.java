package com.example.springdatajpa.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;

    private String nomUniversite;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Departement> Departements;
}
