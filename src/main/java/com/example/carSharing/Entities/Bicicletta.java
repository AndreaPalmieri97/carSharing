package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table
public class Bicicletta{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Check(constraints = "n_marce >= 0")
    private int nMarce;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;

    public Bicicletta(int id, int nMarce, Veicolo veicolo) {
        this.id = id;
        this.nMarce = nMarce;
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

    public int getnMarce() {
        return nMarce;
    }

    public void setnMarce(int nMarce) {
        this.nMarce = nMarce;
    }

}
