package com.example.carSharing.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Table
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Bicicletta{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Check(constraints = "n_marce >= 0")
    private int nMarce;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;


}
