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
public class Moto extends VeicoloACombustione{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private boolean marce;
    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;


}
