package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
public class Patente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String tipoPatente;
    @Column(nullable = false)
    private LocalDate scadenza;

    @ManyToOne(fetch = FetchType.LAZY)
    private Utente utente;

    public Patente() {
    }

    public Patente(int id, String tipoPatente, LocalDate scadenza, Utente utente) {
        this.id = id;
        this.tipoPatente = tipoPatente;
        this.scadenza = scadenza;
        this.utente = utente;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPatente() {
        return tipoPatente;
    }

    public void setTipoPatente(String tipoPatente) {
        this.tipoPatente = tipoPatente;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public void setScadenza(LocalDate scadenza) {
        this.scadenza = scadenza;
    }
}
