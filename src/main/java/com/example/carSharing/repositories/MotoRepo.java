package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface MotoRepo extends JpaRepository<Moto,Long> {
}
