package com.ms.grademaster.comons.utils.enums;

public enum RolUsuarioEnum {

    ADMINISTRATIVO("administrativo"),
    ESTUDIANTE("estudiante"),
    DOCENTE("docente");

    private String descripcion;

     RolUsuarioEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
