package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "veicolo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Veicolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(nullable = false)
    protected String marca;
    @Column(nullable = false)
    protected String modello;
    @Column(nullable = false)
    protected boolean disponibilita = true;
    @Column(nullable = false)
    @Check(constraints = "n_ruote > 0")
    protected int nRuote;
    @Column(nullable = false)
    @Check(constraints = "tariffa > 0")
    protected double tariffa;
    @Column(nullable = false)
    protected String posizione;
    @Column(nullable = false)
    @Check(constraints = "n_posti > 0")
    protected int nPosti;

    public Veicolo() {
    }

    public Veicolo(int id, String marca, String modello, boolean disponibilita, int nRuote,
                   double tariffa, String posizione, int nPosti) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.disponibilita = disponibilita;
        this.nRuote = nRuote;
        this.tariffa = tariffa;
        this.posizione = posizione;
        this.nPosti = nPosti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public boolean isDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }

    public int getnRuote() {
        return nRuote;
    }

    public void setnRuote(int nRuote) {
        this.nRuote = nRuote;
    }

    public double getTariffa() {
        return tariffa;
    }

    public void setTariffa(double tariffa) {
        this.tariffa = tariffa;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public int getnPostiVeicolo() {
        return nPosti;
    }

    public void setnPostiVeicolo(int nPosti) {
        this.nPosti = nPosti;
    }
}
