package com.ms.grademaster.comons.dto;


import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalTime;

@Data
public class MateriaHorarioDto {

    private MateriaDto codigoMateriaEntityFk;

    private LocalTime horaInicio;

    private LocalTime horaFin;

    private EstadoDto idEstadoEntityFk;

    private SemestreDto codigoSemestreEntityFk;

}