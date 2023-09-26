package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Bicicletta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiciclettaRepo extends JpaRepository<Bicicletta,Long> {
}
