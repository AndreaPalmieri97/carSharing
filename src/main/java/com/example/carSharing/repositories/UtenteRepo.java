package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepo extends JpaRepository<Utente,Long> {
}
