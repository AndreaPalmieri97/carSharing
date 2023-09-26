package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.time.LocalDateTime;
@Entity
@Table

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

    public Noleggio() {
    }

    public Noleggio(int id, LocalDateTime dataInizio, LocalDateTime dataFine, double costoTotale, Utente utente, Veicolo veicolo) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.costoTotale = costoTotale;
        this.utente = utente;
        this.veicolo = veicolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public double getCostoTotale() {
        return costoTotale;
    }

    public void setCostoTotale(double costoTotale) {
        this.costoTotale = costoTotale;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }
}
