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

    public boolean isMarce() {
        return marce;
    }

    public void setMarce(boolean marce) {
        this.marce = marce;
    }

    public Moto(int cilindrata, String tipoCombustibile, String tipoPatente, String statoCarburante, String targa, int id, boolean marce) {
        super(cilindrata, tipoCombustibile, tipoPatente, statoCarburante, targa);
        this.id = id;
        this.marce = marce;
    }
}
