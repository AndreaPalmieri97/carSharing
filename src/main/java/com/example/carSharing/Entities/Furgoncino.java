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
public class Furgoncino extends VeicoloACombustione{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    @Check(constraints = "peso_trasportabile > 0")
    private int pesoTrasportabile;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;

    
}


