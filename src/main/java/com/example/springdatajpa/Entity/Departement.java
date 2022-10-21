package com.example.springdatajpa.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Departement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepartement;

    private String nomDepartement;

    @OneToMany(mappedBy = "departement")
    private List<Etudiant>etudiants;

}
