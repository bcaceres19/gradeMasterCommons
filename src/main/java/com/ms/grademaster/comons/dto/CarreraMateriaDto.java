package com.ms.grademaster.comons.dto;

import com.ms.grademaster.comons.entity.CarreraEntity;
import com.ms.grademaster.comons.entity.MateriaEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarreraMateriaDto {

    private CarreraDto carreraEntity;

    private MateriaDto materiaEntity;

}