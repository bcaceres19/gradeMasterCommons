package com.ms.grademaster.comons.dto;

import lombok.Data;


@Data
public class DocenteMateriaDto {

    private MateriaDto codigoMateriaEntityFk;

    private DocenteDto codigoDocenteEntityFk;

    private SemestreDto codigoSemestreEntityFk;

    private EstadoDto idEstadoEntityFk;

}