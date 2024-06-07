package com.ms.grademaster.comons.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Data;

@Data
@Embeddable
public class NotaMateriaId {

    private String codigoSemestreEntityFk;
    private String codigoMateriaEntityFk;
    private String codigoEstudianteEntityFk;
    private String codigoNotaEntityFk;

}
