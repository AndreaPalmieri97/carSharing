package com.example.carSharing.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonopattinoElettrico extends VeicoloElettrico{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String colore;
    @Column(nullable = false)
    @Check(constraints = "velocita_max > 0")
    private int velocitaMax;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;


}
