package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Estudiante")
public class EstudianteEntity {
    @Id
    @Column(name = "codigo_estudiante", nullable = false, length = 10)
    private String codigoEstudiante;

    @Nationalized
    @Column(name = "correo_universitario", nullable = false, length = 70)
    private String correoUniversitario;

    @Column(name = "edad", columnDefinition = "tinyint not null")
    private Short edad;

    @Nationalized
    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Nationalized
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @Nationalized
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @Nationalized
    @Column(name = "correo_personal", nullable = false, length = 70)
    private String correoPersonal;

    @Column(name = "genero", nullable = false)
    private Character genero;

    @Nationalized
    @Column(name = "url_imagen", nullable = false, length = 20)
    private String codigoImagen;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_carrera_fk", nullable = false)
    private CarreraEntity codigoCarreraEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_fk", nullable = false)
    private EstadoEntity estadoEntityFk;

    @Column(name = "cedula_estudiante")
    private String cedulaEstudiante;

}