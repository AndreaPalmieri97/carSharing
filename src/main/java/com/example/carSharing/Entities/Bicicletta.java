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

    public Bicicletta(int id, int nMarce) {
        this.id = id;
        this.nMarce = nMarce;
    }

    public int getnMarce() {
        return nMarce;
    }

    public void setnMarce(int nMarce) {
        this.nMarce = nMarce;
    }

}
