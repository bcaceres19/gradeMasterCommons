package com.ms.grademaster.comons.service.impl;

import com.ms.grademaster.comons.dto.CarreraDto;
import com.ms.grademaster.comons.dto.DocenteDto;
import com.ms.grademaster.comons.dto.EstudianteDto;
import com.ms.grademaster.comons.dto.MateriaDto;
import com.ms.grademaster.comons.repository.*;
import com.ms.grademaster.comons.service.IGenerarRecursos;
import com.ms.grademaster.comons.utils.constants.Constantes;
import com.ms.grademaster.comons.utils.enums.TipoUsuarioEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

import static com.ms.grademaster.comons.utils.constants.Constantes.EXTENSION_CORREO;

@Service
@Log4j2
@RequiredArgsConstructor
public class GenerarRecursos implements IGenerarRecursos {

    @Qualifier("estuidante_reposiotory_commons_entity")
    private final EstudianteRepository estudianteRepository;

    @Qualifier("carrera_repository_commons_entity")
    private final CarreraRepository carreraRepository;

    @Qualifier("materia_repository_commons_entity")
    private final MateriaRepository materiaRepository;

    @Qualifier("docente_repository_commons_entity")
    private final DocenteRepository docenteRepository;

    @Qualifier("nota_repository_commons_entity")
    private final NotaRepository notaRepository;

    @Override
    public String generarCodigo(Object objeto, TipoUsuarioEnum tipoUsuario, String inicialesConstante) {
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();
        switch (tipoUsuario) {
            case ESTUDIANTE:
                do {
                    EstudianteDto estudiante = (EstudianteDto) objeto;
                    codigo.append(inicialesConstante)
                            .append(LocalDate.now().getYear())
                            .append(estudiante.getCedulaEstudiante()
                                    .substring(estudiante.getCedulaEstudiante().length() - 3));
                } while (estudianteRepository.existsByCodigoEstudiante(codigo.toString()));
                break;
            case DOCENTE:
                DocenteDto docente = (DocenteDto) objeto;
                codigo.append(inicialesConstante)
                        .append(LocalDate.now().getYear())
                        .append(docente.getCedulaDocente()
                                .substring(docente.getCedulaDocente().length() - 3));
                if(docenteRepository.existsByCodigoDocente(codigo.toString())){
                    return "ERROR";
                }
                break;
            case CARRERA, MATERIA:
                while (true) {
                    if (inicialesConstante.equals(Constantes.INICIALES_CARRERA)) {
                        codigo.append(inicialesConstante)
                                .append(LocalDate.now().getYear())
                                .append(random.nextInt(900) + 100);
                        if (!carreraRepository.existsByCodigoCarrera(codigo.toString())) {
                            break;
                        }
                    } else {
                        codigo.append(inicialesConstante)
                                .append(LocalDate.now().getYear())
                                .append(random.nextInt(900) + 100);
                        if (!materiaRepository.existsByCodigo(codigo.toString())) {
                            break;
                        }
                    }
                }
                break;
            case NOTA:
                do {
                    codigo.append(inicialesConstante)
                            .append(random.nextInt(9000000) + 1000000);
                } while (notaRepository.existsByCodigoNota(codigo.toString()));
                break;
            default:
                break;
        }
        return codigo.toString();
    }

    @Override
    public String generarCorreo(Object objeto, TipoUsuarioEnum tipoUsuario) {
        StringBuilder correoU = new StringBuilder();
        switch (tipoUsuario) {
            case ESTUDIANTE -> {
                EstudianteDto estudiante = (EstudianteDto) objeto;
                correoU.append(estudiante.getNombres().replace(" ", "")).append(".");
                correoU.append(estudiante.getApellidos().replace(" ", ""))
                        .append(".")
                        .append(estudiante.getCedulaEstudiante().substring(estudiante.getCedulaEstudiante().length() - 3))
                        .append(EXTENSION_CORREO);
            }
            case DOCENTE -> {
                DocenteDto docente = (DocenteDto) objeto;
                correoU.append(docente.getNombres().replace(" ", "")).append(".");
                correoU.append(docente.getApellidos().replace(" ", ""))
                        .append(".")
                        .append(docente.getCodigoDocente().substring(docente.getCedulaDocente().length() - 3))
                        .append(EXTENSION_CORREO);
            }
        }
        return correoU.toString();
    }
}
