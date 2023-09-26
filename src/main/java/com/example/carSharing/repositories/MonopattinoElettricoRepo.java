package com.example.carSharing.repositories;

import com.example.carSharing.Entities.MonopattinoElettrico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface MonopattinoElettricoRepo extends JpaRepository<MonopattinoElettrico,Long> {
}
