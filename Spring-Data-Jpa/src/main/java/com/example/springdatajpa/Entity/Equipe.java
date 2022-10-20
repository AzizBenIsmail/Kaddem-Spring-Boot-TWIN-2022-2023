package com.example.springdatajpa.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipe ;

    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne
    @JoinColumn(name = "IdDetailsEquipes")
    private DetailsEquipe Details_Equipe;

    @ManyToMany
    @JoinColumn(name = "etudiants")
    private List<Etudiant> etudiants;
}
