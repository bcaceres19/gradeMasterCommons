package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Administrativo")
public class AdministrativoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrativo", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "nombres", nullable = false, length = 70)
    private String nombres;

    @Nationalized
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @Column(name = "edad", columnDefinition = "tinyint not null")
    private Short edad;

    @Nationalized
    @Column(name = "correo_personal", nullable = false, length = 70)
    private String correoPersonal;

    @Nationalized
    @Column(name = "correo_universitario", nullable = false, length = 70)
    private String correoUniversitario;

    @Nationalized
    @Column(name = "genero", nullable = false, length = 1)
    private String genero;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_fk", nullable = false)
    private EstadoEntity estadoEntityFk;

    @Nationalized
    @Column(name = "codigo_imagen", nullable = false, length = 20)
    private String codigoImagen;

    @Column(name = "cedula_administrativo")
    private String cedulaAdministrativo;

    @Column(name = "codigo_administrativo")
    private String codigoAdministrativo;

}