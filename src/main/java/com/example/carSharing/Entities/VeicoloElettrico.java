package com.example.carSharing.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Check;

@MappedSuperclass
public class VeicoloElettrico{

    @Column(nullable = false)
    protected String statoBatteria;
    @Column(nullable = false)
    @Check(constraints = "tempo_ricarica > 0")
    protected int tempoRicarica;
    @Column(nullable = false)
    @Check(constraints = "autonomia >= 0")
    protected int autonomia;

    public VeicoloElettrico(String statoBatteria, int tempoRicarica, int autonomia) {
        this.statoBatteria = statoBatteria;
        this.tempoRicarica = tempoRicarica;
        this.autonomia = autonomia;
    }

    public String getStatoBatteria() {
        return statoBatteria;
    }

    public void setStatoBatteria(String statoBatteria) {
        this.statoBatteria = statoBatteria;
    }

    public int getTempoRicarica() {
        return tempoRicarica;
    }

    public void setTempoRicarica(int tempoRicarica) {
        this.tempoRicarica = tempoRicarica;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

}
