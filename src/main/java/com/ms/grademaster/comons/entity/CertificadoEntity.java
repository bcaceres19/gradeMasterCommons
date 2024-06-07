package com.ms.grademaster.comons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Certificado")
public class CertificadoEntity {
    @Id
    @Column(name = "codigo_certificado", nullable = false, length = 10)
    private String codigoCertificado;

    @Nationalized
    @Column(name = "nombre_certificado", nullable = false, length = 50)
    private String nombreCertificado;

    @Column(name = "fecha_finalizacion", nullable = false)
    private LocalDate fechaFinalizacion;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fehcaInicio;

}