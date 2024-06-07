package com.ms.grademaster.comons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Carrera")
public class CarreraEntity {
    @Id
    @Column(name = "codigo_carrera", nullable = false, length = 10)
    private String codigoCarrera;

    @Nationalized
    @Column(name = "nombre_carrera", nullable = false, length = 50)
    private String nombreCarrera;

    @Column(name = "total_creditos")
    private String nCreditos;

}