package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
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

    public Utente(int id, String nome, String cognome, LocalDate dataDiNascita, String codiceFiscale, boolean casco, double creditoAffitti) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.codiceFiscale = codiceFiscale;
        this.casco = casco;
        this.creditoAffitti = creditoAffitti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public double getCreditoAffitti() {
        return creditoAffitti;
    }

    public void setCreditoAffitti(double creditoAffitti) {
        this.creditoAffitti = creditoAffitti;
    }

}
