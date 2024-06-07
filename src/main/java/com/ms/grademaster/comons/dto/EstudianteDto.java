package com.ms.grademaster.comons.dto;

import lombok.Data;


@Data
public class EstudianteDto {

    private String codigoEstudiante;

    private String correoUniversitario;

    private Short edad;

    private String telefono;

    private String apellidos;

    private String nombres;

    private String correoPersonal;

    private Character genero;

    private String codigoImagen;

    private CarreraDto codigoCarreraEntityFk;

    private EstadoDto estadoEntityFk;

    private String cedulaEstudiante;

}