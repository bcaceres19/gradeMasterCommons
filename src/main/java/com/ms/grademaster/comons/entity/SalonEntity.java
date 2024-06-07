package com.ms.grademaster.comons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "Salon")
public class SalonEntity {
    @Id
    @Column(name = "id_salon", nullable = false)
    private Integer id;

    @Column(name = "codigo_salon", nullable = false, length = 5)
    private String codigoSalon;

}