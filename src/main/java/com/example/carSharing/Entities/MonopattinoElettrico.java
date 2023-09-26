package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table
public class MonopattinoElettrico extends VeicoloElettrico{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String colore;
    @Column(nullable = false)
    @Check(constraints = "velocita_max > 0")
    private int velocitaMax;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;

    public MonopattinoElettrico() {
    }

    public MonopattinoElettrico(String statoBatteria, int tempoRicarica, int autonomia, int id, String colore, int velocitaMax, Veicolo veicolo) {
        super(statoBatteria, tempoRicarica, autonomia);
        this.id = id;
        this.colore = colore;
        this.velocitaMax = velocitaMax;
        this.veicolo = veicolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getVelocitaMax() {
        return velocitaMax;
    }

    public void setVelocitaMax(int velocitaMax) {
        this.velocitaMax = velocitaMax;
    }

}
