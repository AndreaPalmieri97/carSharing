package com.example.carSharing.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;
    @Column(nullable = false)
    private LocalDate dataDiNascita;
    @Column(nullable = false)
    private String codiceFiscale;
    @Column(nullable = false)
    private boolean casco;
    @Column(nullable = false)
    @Check(constraints = "credito_affitti > 0")
    private double creditoAffitti;

    
}
