package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Docente")
public class DocenteEntity {
    @Id
    @Column(name = "codigo_docente", nullable = false, length = 10)
    private String codigoDocente;

    @Nationalized
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @Nationalized
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @Column(name = "edad")
    private String edad;

    @Nationalized
    @Column(name = "correo_personal", nullable = false, length = 70)
    private String correoPersonal;

    @Nationalized
    @Column(name = "correo_universitario", nullable = false, length = 70)
    private String correoUniversitario;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Nationalized
    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Nationalized
    @Column(name = "url_imagen", nullable = false, length = 20)
    private String urlImagen;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_fk", nullable = false)
    private EstadoEntity estadoEntityFk;

    @Column(name = "cedula_docente")
    private String cedulaDocente;

}