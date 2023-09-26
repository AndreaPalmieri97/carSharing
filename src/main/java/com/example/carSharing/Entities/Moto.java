package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table
public class Moto extends VeicoloACombustione{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private boolean marce;
    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;

    public Moto() {
    }

    public Moto(int cilindrata, String tipoCombustibile, String tipoPatente, String statoCarburante, String targa, int id, boolean marce, Veicolo veicolo) {
        super(cilindrata, tipoCombustibile, tipoPatente, statoCarburante, targa);
        this.id = id;
        this.marce = marce;
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

    public boolean isMarce() {
        return marce;
    }



    public void setMarce(boolean marce) {
        this.marce = marce;
    }


}
