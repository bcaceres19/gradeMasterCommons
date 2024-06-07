package com.ms.grademaster.comons.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Data
public class CertificadoDto {

    private String codigoCertificado;


    private String nombreCertificado;


    private LocalDate fechaFinalizacion;

    private LocalDate fehcaInicio;

}