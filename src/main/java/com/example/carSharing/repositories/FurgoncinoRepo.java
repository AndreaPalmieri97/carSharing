package com.example.carSharing.repositories;

import com.example.carSharing.Entities.Furgoncino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface FurgoncinoRepo extends JpaRepository<Furgoncino,Long> {
}
