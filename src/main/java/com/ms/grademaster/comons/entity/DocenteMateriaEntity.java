package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "docente_materia")
public class DocenteMateriaEntity {

    @EmbeddedId
    private DocenteMateriaId docenteMateriaId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoMateriaEntityFk")
    @JoinColumn(name = "codigo_materia_fk", nullable = false)
    private MateriaEntity codigoMateriaEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoDocenteEntityFk")
    @JoinColumn(name = "codigo_docente_fk", nullable = false)
    private DocenteEntity codigoDocenteEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoSemestreEntityFk")
    @JoinColumn(name = "codigo_semestre_fk", nullable = false)
    private SemestreEntity codigoSemestreEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idEstadoEntityFk")
    @JoinColumn(name = "id_estado_fk", nullable = false)
    private EstadoEntity idEstadoEntityFk;

}