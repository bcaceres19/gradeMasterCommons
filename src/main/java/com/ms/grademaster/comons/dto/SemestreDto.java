package com.ms.grademaster.comons.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SemestreDto {

    private String codigoSemestre;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

}
