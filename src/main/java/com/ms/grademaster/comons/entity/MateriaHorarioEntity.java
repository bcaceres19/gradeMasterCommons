package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "materia_horario")
public class MateriaHorarioEntity {

    @EmbeddedId
    private MateriaHorarioId materiaHorarioId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoMateriaEntityFk")
    @JoinColumn(name = "codigo_materia_fk", nullable = false)
    private MateriaEntity codigoMateriaEntityFk;

    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "hora_final", nullable = false)
    private LocalTime horaFin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idEstadoEntityFk")
    @JoinColumn(name = "id_estado_fk", nullable = false)
    private EstadoEntity idEstadoEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoSemestreEntityFk")
    @JoinColumn(name = "codigo_semestre_fk", nullable = false)
    private SemestreEntity codigoSemestreEntityFk;

}