package com.example.carSharing.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Table
@Data
@NoArgsConstructor
public class Automobile extends VeicoloACombustione{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Check(constraints = "n_porte > 0")
    private int nPorte;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veicolo veicolo;

}
