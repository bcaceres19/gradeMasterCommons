package com.ms.grademaster.comons.service;

import com.ms.grademaster.comons.dto.EstudianteDto;
import com.ms.grademaster.comons.utils.constants.Constantes;
import com.ms.grademaster.comons.utils.enums.TipoUsuarioEnum;

public interface IGenerarRecursos {

    String generarCodigo(Object objeto, TipoUsuarioEnum tipoUsuario, String inicialesConstante);

    String generarCorreo(Object objeto, TipoUsuarioEnum tipoUsuario);

}
