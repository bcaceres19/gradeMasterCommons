package com.ms.grademaster.comons.utils.enums;

public enum EstadoRespuestaEnum {

    OK("ok"),
    ERROR("error");

    private String descripcion;

    EstadoRespuestaEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
