package com.ms.grademaster.comons.utils.enums;

public enum GenerosEnum {

    MASCULINO("M"),
        FEMENINO("F");

    private String descripcion;

    GenerosEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
