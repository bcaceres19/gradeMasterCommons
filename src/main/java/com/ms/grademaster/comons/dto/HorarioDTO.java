package com.ms.grademaster.comons.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class HorarioDTO {
    private LocalTime horaInicio;

    private LocalTime horaFinal;
}
