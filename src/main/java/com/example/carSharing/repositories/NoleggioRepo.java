package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Noleggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoleggioRepo extends JpaRepository<Noleggio,Long> {
}
