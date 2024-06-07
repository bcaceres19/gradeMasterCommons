package com.ms.grademaster.comons.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class NotaDto {

    private String codigoNota;

    private BigDecimal porcentajeNota;

    private Short nrNota;

    private MateriaDto materiaEntityFk;

    private DocenteDto docenteEntityFk;

}
