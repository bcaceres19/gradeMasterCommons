package com.ms.grademaster.comons.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;


@Data
public class CarreraDto {

    private String codigoCarrera;

    private String nombreCarrera;

    private String nCreditos;

}