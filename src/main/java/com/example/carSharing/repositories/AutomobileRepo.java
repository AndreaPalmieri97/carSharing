package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Automobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public  interface AutomobileRepo extends JpaRepository<Automobile,Long> {
}
