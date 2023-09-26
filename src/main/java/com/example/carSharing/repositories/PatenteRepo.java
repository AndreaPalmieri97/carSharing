package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Patente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface PatenteRepo extends JpaRepository<Patente,Long> {

}
