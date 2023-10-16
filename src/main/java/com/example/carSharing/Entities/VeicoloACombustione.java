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
public class VeicoloACombustione{

    @Column(nullable = false)
    @Check(constraints = "cilindrata > 0")
    protected int cilindrata;
    @Column(nullable = false)
    protected String tipoCombustibile;
    @Column(nullable = false)
    protected String tipoPatente;
    @Column(nullable = false)
    protected String statoCarburante;
    @Column(nullable = false)
    protected String targa;

}
