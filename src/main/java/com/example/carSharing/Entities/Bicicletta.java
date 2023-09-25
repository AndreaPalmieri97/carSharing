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
    private int nMarce;

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
