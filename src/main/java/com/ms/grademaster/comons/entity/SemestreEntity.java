package com.ms.grademaster.comons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Semestre")
public class SemestreEntity {
    @Id
    @Column(name = "codigo_semestre", nullable = false, length = 10)
    private String codigoSemestre;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

}