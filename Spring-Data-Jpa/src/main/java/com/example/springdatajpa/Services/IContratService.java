package com.example.springdatajpa.Services;

import com.example.springdatajpa.Entity.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat c);
    List<Contrat> addContrat (List<Contrat> listContrat);

    Contrat updateContrat(Contrat c);
    List<Contrat> updateContrat (List<Contrat> listContrat);

    void deleteContrat(int id);
    void deleteContrat(Contrat c);

    List<Contrat> findAllContrat();
    Contrat findContratById(int id);


}
