package com.ms.grademaster.comons.dto;


import lombok.Data;


@Data
public class SalonMateriaEntityDto {

    private SalonDto idSalonEntityFk;

    private MateriaDto codigoMateriaEntityFk;

    private EstadoDto idEstadoEntityFk;

}