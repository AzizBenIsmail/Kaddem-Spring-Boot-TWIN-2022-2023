package com.example.springdatajpa.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailsEquipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailsEquipe;

    private int salle;

    private String thematique;

    @JoinColumn(name = "Equipes")
    @OneToOne(mappedBy = "Details_Equipe")
    private Equipe equipes;
}