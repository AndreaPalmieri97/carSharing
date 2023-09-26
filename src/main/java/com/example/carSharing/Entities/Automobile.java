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

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;

    public Automobile() {
    }

    public Automobile(int cilindrata, String tipoCombustibile, String tipoPatente, String statoCarburante, String targa, int id, int nPorte, Veicolo veicolo) {
        super(cilindrata, tipoCombustibile, tipoPatente, statoCarburante, targa);
        this.id = id;
        this.nPorte = nPorte;
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

    public int getnPorte() {
        return nPorte;
    }

    public void setnPorte(int nPorte) {
        this.nPorte = nPorte;
    }

}
