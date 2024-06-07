package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Materia")
@NoArgsConstructor
public class MateriaEntity {
    @Id
    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;

    @Nationalized
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "ncreditos", columnDefinition = "tinyint not null")
    private Short nCreditos;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_fk", nullable = false)
    private EstadoEntity estadoEntityFk;

    public MateriaEntity(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}