package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.HorarioDTO;
import com.ms.grademaster.comons.entity.*;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MateriaHorarioMapper {

    default List<MateriaHorarioEntity> objetosListToMateriaHorario(MateriaEntity materia,
                                                         List<HorarioDTO> horarios,
                                                         EstadoEntity estado,
                                                         SemestreEntity semestre){
        List<MateriaHorarioEntity> materiaHorarioEntityList = new ArrayList<>();
        for(HorarioDTO horario : horarios){
            MateriaHorarioId materiaHorarioId = new MateriaHorarioId();
            materiaHorarioId.setCodigoMateriaEntityFk(materia.getCodigo());
            materiaHorarioId.setCodigoSemestreEntityFk(semestre.getCodigoSemestre());
            materiaHorarioId.setIdEstadoEntityFk(estado.getId());
            MateriaHorarioEntity materiaHorarioEntity = new MateriaHorarioEntity();
            materiaHorarioEntity.setMateriaHorarioId(materiaHorarioId);
            materiaHorarioEntity.setCodigoMateriaEntityFk(materia);
            materiaHorarioEntity.setHoraInicio(horario.getHoraInicio());
            materiaHorarioEntity.setHoraFin(horario.getHoraFinal());
            materiaHorarioEntity.setCodigoSemestreEntityFk(semestre);
            materiaHorarioEntity.setIdEstadoEntityFk(estado);
            materiaHorarioEntityList.add(materiaHorarioEntity);
        }
        return materiaHorarioEntityList;
    }

}
