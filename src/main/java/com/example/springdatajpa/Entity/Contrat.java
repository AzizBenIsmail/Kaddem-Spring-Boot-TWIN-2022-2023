package com.example.springdatajpa.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;

    @Temporal(TemporalType.DATE)
    private Date dateDebutC;

    @Temporal(TemporalType.DATE)
    private Date dateFinC;

    private Specialite specialite;

    private boolean archive;

    private  float montantC;

    @ManyToOne
    private Etudiant etudiants;

}
