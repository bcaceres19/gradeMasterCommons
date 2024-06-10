package com.ms.grademaster.comons.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class MateriasHorasDto {

    private String codigo;
    private String nombre;
    private String nrCreditos;
    private LocalTime horaInicio;
    private LocalTime horaFin;

}
