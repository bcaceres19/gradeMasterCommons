package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "SalonMateria")
public class SalonMateriaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_salon_fk", nullable = false)
    private SalonEntity idSalonEntityFk;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_materia_fk", nullable = false)
    private MateriaEntity codigoMateriaEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estado_fk", nullable = false)
    private EstadoEntity idEstadoEntityFk;

}