package com.example.springdatajpa.Repository;

import com.example.springdatajpa.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
