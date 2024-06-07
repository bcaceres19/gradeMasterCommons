package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "estudiante_materia")
public class EstudianteMateriaEntity {

    @EmbeddedId
    private EstudianteMateriaId estudianteMateriaId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoMateriaEntityFk")
    @JoinColumn(name = "codigo_materia_fk", nullable = false)
    private MateriaEntity codigoMateriaEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoEstudianteEntityFk")
    @JoinColumn(name = "codigo_estudiante_fk", nullable = false)
    private EstudianteEntity codigoEstudianteEntityFk;

}