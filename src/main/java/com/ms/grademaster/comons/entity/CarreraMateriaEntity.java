package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Carrera_Materia")
public class CarreraMateriaEntity {

    @EmbeddedId
    private CarreraMateriaId carreraMateriaId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoCarreraFk")
    @JoinColumn(name = "codigo_carrera_fk", nullable = false)
    private CarreraEntity carreraEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoMateriaFk")
    @JoinColumn(name = "codigo_materia_fk", nullable = false)
    private MateriaEntity materiaEntity;

}