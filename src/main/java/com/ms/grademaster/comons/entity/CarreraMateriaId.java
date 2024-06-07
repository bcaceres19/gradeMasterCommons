package com.ms.grademaster.comons.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class CarreraMateriaId implements Serializable {

    private String codigoCarreraFk;
    private String codigoMateriaFk;
}
