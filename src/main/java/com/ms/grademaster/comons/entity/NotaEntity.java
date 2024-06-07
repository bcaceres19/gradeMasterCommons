package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Nota")
@NoArgsConstructor
public class NotaEntity {
    @Id
    @Column(name = "codigo_nota", nullable = false, length = 10)
    private String codigoNota;

    @Column(name = "porcentaje_nota", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcentajeNota;

    @Column(name = "nr_nota", columnDefinition = "tinyint not null")
    private Short nrNota;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "materia_fk", nullable = false)
    private MateriaEntity materiaEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "docente_fk", nullable = false)
    private DocenteEntity docenteEntityFk;

    public NotaEntity(String codigoNota, BigDecimal porcentajeNota, Short nrNota) {
        this.codigoNota = codigoNota;
        this.porcentajeNota = porcentajeNota;
        this.nrNota = nrNota;
    }
}