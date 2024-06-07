package com.ms.grademaster.comons.dto;

import lombok.Data;

@Data
public class DocenteDto {

    private String codigoDocente;

    private String nombres;

    private String apellidos;

    private String edad;

    private String correoPersonal;

    private String correoUniversitario;

    private String genero;

    private String telefono;

    private String urlImagen;

    private EstadoDto estadoEntityFk;

    private String cedulaDocente;

}