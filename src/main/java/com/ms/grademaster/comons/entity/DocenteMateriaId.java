package com.ms.grademaster.comons.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class DocenteMateriaId {

    private String codigoMateriaEntityFk;
    private String codigoDocenteEntityFk;
    private String codigoSemestreEntityFk;
    private Integer idEstadoEntityFk;


}
