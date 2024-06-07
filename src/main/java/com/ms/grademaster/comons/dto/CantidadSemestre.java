package com.ms.grademaster.comons.dto;

import com.ms.grademaster.comons.entity.EstudianteEntity;
import com.ms.grademaster.comons.entity.SemestreEntity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CantidadSemestre {

    private Integer numeroSemestre;

    private SemestreDto codigoSemestreFk;

    private EstudianteDto codigoEstudianteFk;

}
