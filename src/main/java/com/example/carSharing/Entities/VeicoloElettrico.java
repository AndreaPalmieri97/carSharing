package com.example.carSharing.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;
@Data
@AllArgsConstructor
@NoArgsConstructor
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


}
