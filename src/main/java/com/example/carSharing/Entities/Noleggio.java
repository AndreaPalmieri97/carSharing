package com.example.carSharing.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Noleggio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDateTime dataInizio;
    @Column(nullable = false)
    private LocalDateTime dataFine;
    @Column(nullable = false)
    @Check(constraints = "costo_totale>0")
    private double costoTotale;
    @ManyToOne(fetch = FetchType.LAZY)
    private Utente utente;
    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;


}
