package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table
public class Furgoncino extends VeicoloACombustione{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    @Check(constraints = "peso_trasportabile > 0")
    private int pesoTrasportabile;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;

    public Furgoncino(int cilindrata, String tipoCombustibile, String tipoPatente, String statoCarburante, String targa, int id, int pesoTrasportabile, Veicolo veicolo) {
        super(cilindrata, tipoCombustibile, tipoPatente, statoCarburante, targa);
        this.id = id;
        this.pesoTrasportabile = pesoTrasportabile;
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

    public int getPesoTrasportabile() {
        return pesoTrasportabile;
    }

    public void setPesoTrasportabile(int pesoTrasportabile) {
        this.pesoTrasportabile = pesoTrasportabile;
    }


}
