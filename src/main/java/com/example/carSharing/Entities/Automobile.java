package com.example.carSharing.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table
public class Automobile extends VeicoloACombustione{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Check(constraints = "n_porte > 0")
    private int nPorte;

    public Automobile(int cilindrata, String tipoCombustibile, String tipoPatente, String statoCarburante, String targa, int id, int nPorte) {
        super(cilindrata, tipoCombustibile, tipoPatente, statoCarburante, targa);
        this.id = id;
        this.nPorte = nPorte;
    }

    public int getnPorte() {
        return nPorte;
    }

    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

}
