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
    private int pesoTrasportabile;


    public int getPesoTrasportabile() {
        return pesoTrasportabile;
    }

    public void setPesoTrasportabile(int pesoTrasportabile) {
        this.pesoTrasportabile = pesoTrasportabile;
    }

    public Furgoncino(int cilindrata, String tipoCombustibile, String tipoPatente, String statoCarburante, String targa, int id, int pesoTrasportabile) {
        super(cilindrata, tipoCombustibile, tipoPatente, statoCarburante, targa);
        this.id = id;
        this.pesoTrasportabile = pesoTrasportabile;
    }
}
