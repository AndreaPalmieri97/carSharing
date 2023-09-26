package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Veicolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeicoloRepo extends JpaRepository<Veicolo,Long> {

}
