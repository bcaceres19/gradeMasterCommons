package com.ms.grademaster.comons.dto;


import lombok.Data;


import java.math.BigDecimal;

@Data
public class  NotaMateriaDto {

    private SemestreDto codigoSemestreEntityFk;

    private MateriaDto codigoMateriaEntityFk;

    private EstudianteDto codigoEstudianteEntityFk;

    private NotaDto codigoNotaEntityFk;

    private BigDecimal valorNota;

    private Long numeroCorte;

}