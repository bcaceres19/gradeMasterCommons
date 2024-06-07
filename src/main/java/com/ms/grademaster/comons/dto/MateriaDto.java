package com.ms.grademaster.comons.dto;

import lombok.Data;

@Data
public class MateriaDto {

    private String codigo;

    private String nombre;

    private Short nCreditos;

    private EstadoDto estadoEntityFk;
}
