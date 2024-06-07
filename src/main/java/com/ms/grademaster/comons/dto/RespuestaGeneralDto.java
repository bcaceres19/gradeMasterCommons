package com.ms.grademaster.comons.dto;

import com.ms.grademaster.comons.utils.enums.EstadoRespuestaEnum;
import lombok.Data;

@Data
public class RespuestaGeneralDto {

    private EstadoRespuestaEnum estado;

    private Object data;

    private String detalle;

}
