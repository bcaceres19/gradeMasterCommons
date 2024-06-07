package com.ms.grademaster.comons.utils.enums;

public enum EstadosUsuariosEnum {

    ACTIVO("A"),
    INACTIVO("I");

    private String descripcion;

    EstadosUsuariosEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
