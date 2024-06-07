package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "CantidadSemestre")
public class CantidadSemestreEntity {

    @Id
    @Column(name = "numero_semestre", nullable = false)
    private Integer numeroSemestre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_semestre_fk", nullable = false)
    private SemestreEntity codigoSemestreFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_estudiante_fk", nullable = false)
    private EstudianteEntity codigoEstudianteFk;

}