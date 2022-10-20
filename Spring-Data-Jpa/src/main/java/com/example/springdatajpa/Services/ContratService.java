package com.example.springdatajpa.Services;

import com.example.springdatajpa.Repository.ContratRepository;
import com.example.springdatajpa.Entity.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratService implements IContratService {
    @Autowired
    ContratRepository cr;

    @Override
    public Contrat addContrat(Contrat c) {
        return cr.save(c);
    }

    @Override
    public List<Contrat> addContrat(List<Contrat> listContrat) {
        return cr.saveAll(listContrat);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return cr.save(c);
    }

    @Override
    public List<Contrat> updateContrat(List<Contrat> listContrat) {
        return cr.saveAll(listContrat);
    }

    @Override
    public void deleteContrat(int id) {
        cr.deleteById((long) id);
    }

    @Override
    public void deleteContrat(Contrat c) {
        cr.delete(c);
    }

    @Override
    public List<Contrat> findAllContrat() {
        return cr.findAll();
    }

    @Override
    public Contrat findContratById(int id) {
      //  return cr.findById(Long.valueOf(id)).get();
        return  cr.findById((long) id).orElse(new Contrat());
    }
}
