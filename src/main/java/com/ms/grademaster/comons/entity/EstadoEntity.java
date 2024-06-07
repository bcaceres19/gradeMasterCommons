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
@Table(schema = "dbo", name = "Estado")
public class EstadoEntity {
    @Id
    @Column(name = "id_estado", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "nombre", length = 15)
    private String nombre;

}