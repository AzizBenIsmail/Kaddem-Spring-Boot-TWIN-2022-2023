package com.example.springdatajpa.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomE;

    private String prenomE;

    @Enumerated(EnumType.STRING)
    private Domaine domaine;

    @ManyToMany(mappedBy="etudiants")
    private List<Equipe> equipes;

    @OneToMany(mappedBy = "etudiants")
    private List<Contrat> contrats;

    @ManyToOne
    private Departement departement;
}
