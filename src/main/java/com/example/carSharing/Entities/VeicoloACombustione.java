package com.example.carSharing.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Check;

@MappedSuperclass
public class VeicoloACombustione{

    @Column(nullable = false)
    protected int cilindrata;
    @Column(nullable = false)
    protected String tipoCombustibile;
    @Column(nullable = false)
    protected String tipoPatente;
    @Column(nullable = false)
    protected String statoCarburante;
    @Column(nullable = false)
    protected String targa;

    public VeicoloACombustione(int cilindrata, String tipoCombustibile, String tipoPatente, String statoCarburante, String targa) {
        this.cilindrata = cilindrata;
        this.tipoCombustibile = tipoCombustibile;
        this.tipoPatente = tipoPatente;
        this.statoCarburante = statoCarburante;
        this.targa = targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTipoCombustibile() {
        return tipoCombustibile;
    }

    public void setTipoCombustibile(String tipoCombustibile) {
        this.tipoCombustibile = tipoCombustibile;
    }

    public String getTipoPatente() {
        return tipoPatente;
    }

    public void setTipoPatente(String tipoPatente) {
        this.tipoPatente = tipoPatente;
    }

    public String getStatoCarburante() {
        return statoCarburante;
    }

    public void setStatoCarburante(String statoCarburante) {
        this.statoCarburante = statoCarburante;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

}
