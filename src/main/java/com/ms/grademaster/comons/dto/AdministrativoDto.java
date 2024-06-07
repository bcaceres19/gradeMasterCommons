package com.ms.grademaster.comons.dto;

import lombok.Data;


@Data
public class AdministrativoDto {

    private Integer id;

    private String nombres;

    private String apellidos;

    private Short edad;

    private String correoPersonal;

    private String correoUniversitario;

    private String genero;

    private EstadoDto estadoEntityFk;

    private String codigoImagen;

    private String cedulaAdministrativo;

    private String codigoAdministrativo;

}
