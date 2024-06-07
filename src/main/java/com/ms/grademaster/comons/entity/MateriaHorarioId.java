package com.ms.grademaster.comons.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class MateriaHorarioId {
    private String codigoMateriaEntityFk;
    private Integer idEstadoEntityFk;
    private String codigoSemestreEntityFk;
}
