package com.example.springdatajpa.Repository;

import com.example.springdatajpa.Entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
    //select * from Contrat where nom=?
    List<Contrat> findBydateDebutC(Date dateDebutC);
    List<Contrat> getBydateFinC(Date dateFinC);
    //select * from Contrat where nom=? and prenom
    List<Contrat> findByspecialite(String specialite);
    List<Contrat> findByMontantCBetween(float min,float Max);



}
