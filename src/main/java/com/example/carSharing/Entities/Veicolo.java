package com.example.carSharing.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "veicolo")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veicolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(nullable = false)
    protected String marca;
    @Column(nullable = false)
    protected String modello;
    @Column(nullable = false)
    protected boolean disponibilita = true;
    @Column(nullable = false)
    @Check(constraints = "n_ruote > 0")
    protected int nRuote;
    @Column(nullable = false)
    @Check(constraints = "tariffa > 0")
    protected double tariffa;
    @Column(nullable = false)
    protected String posizione;
    @Column(nullable = false)
    @Check(constraints = "n_posti > 0")
    protected int nPosti;


}
