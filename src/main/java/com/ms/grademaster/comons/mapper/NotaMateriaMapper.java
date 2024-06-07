package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.NotaMateriaDto;
import com.ms.grademaster.comons.entity.*;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface NotaMateriaMapper {

    NotaMateriaDto entityToDto(NotaMateriaEntity entity);

    List<NotaMateriaDto> listEntityToListDto(List<NotaMateriaEntity> entities);

    List<NotaMateriaEntity> listDtoToListEntity(List<NotaMateriaDto> dtos);

    default List<NotaMateriaEntity> listDtoToListEntityTru(List<NotaMateriaDto> dtos){
        List<NotaMateriaEntity> listNotasEntity = new ArrayList<>();
        for(NotaMateriaDto notaMateriaDto : dtos){
            NotaMateriaEntity notaMateria = new NotaMateriaEntity();
            MateriaEntity materiaEntity = new MateriaEntity();
            materiaEntity.setCodigo(notaMateriaDto.getCodigoMateriaEntityFk().getCodigo());
            EstudianteEntity estudianteEntity = new EstudianteEntity();
            estudianteEntity.setCodigoEstudiante(notaMateriaDto.getCodigoEstudianteEntityFk().getCodigoEstudiante());
            SemestreEntity semestre = new SemestreEntity();
            semestre.setCodigoSemestre(notaMateriaDto.getCodigoSemestreEntityFk().getCodigoSemestre());
            NotaEntity notaEntity = new NotaEntity();
            notaEntity.setCodigoNota(notaMateriaDto.getCodigoNotaEntityFk().getCodigoNota());
            NotaMateriaId notaMateriaId = new NotaMateriaId();
            notaMateriaId.setCodigoNotaEntityFk(notaMateriaDto.getCodigoNotaEntityFk().getCodigoNota());
            notaMateriaId.setCodigoMateriaEntityFk(notaMateriaDto.getCodigoMateriaEntityFk().getCodigo());
            notaMateriaId.setCodigoEstudianteEntityFk(notaMateriaDto.getCodigoEstudianteEntityFk().getCodigoEstudiante());
            notaMateriaId.setCodigoSemestreEntityFk(notaMateriaDto.getCodigoSemestreEntityFk().getCodigoSemestre());
            notaMateria.setNotaMateriaId(notaMateriaId);
            notaMateria.setCodigoMateriaEntityFk(materiaEntity);
            notaMateria.setCodigoEstudianteEntityFk(estudianteEntity);
            notaMateria.setCodigoSemestreEntityFk(semestre);
            notaMateria.setCodigoNotaEntityFk(notaEntity);
            notaMateria.setValorNota(notaMateriaDto.getValorNota());
            listNotasEntity.add(notaMateria);
        }
        return listNotasEntity;
    }


}
