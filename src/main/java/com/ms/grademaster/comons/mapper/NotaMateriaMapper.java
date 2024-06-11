package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.*;
import com.ms.grademaster.comons.entity.*;
import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.ms.grademaster.comons.utils.utilities.Utilidades.checkType;

@Mapper(componentModel = "spring")
public interface NotaMateriaMapper {

    NotaMateriaEntity dtoToEntity(NotaMateriaDto dto);

    NotaMateriaDto entityToDto(NotaMateriaEntity entity);

    List<NotaMateriaDto> listEntityToListDto(List<NotaMateriaEntity> entities);

    List<NotaMateriaEntity> listDtoToListEntity(List<NotaMateriaDto> dtos);

    default List<NotaMateriaDto> listObjectsToListDtoNota(List<Object[]> listObjects){
        List<NotaMateriaDto> listNotasDto = new ArrayList<>();
        for(Object[] objects : listObjects){
            NotaMateriaDto notaMateriaDto = new NotaMateriaDto();
            notaMateriaDto.setValorNota(checkType(objects[0], BigDecimal.class).orElse(null));
            NotaDto notaDto = new NotaDto();
            notaDto.setPorcentajeNota(checkType(objects[1], BigDecimal.class).orElse(null));
            notaMateriaDto.setCodigoNotaEntityFk(notaDto);
            listNotasDto.add(notaMateriaDto);
        }
        return listNotasDto;
    }

    default List<NotaMateriaDto> listObjectsToListDto(List<Object[]> listObjects){
        List<NotaMateriaDto> listNotasDto = new ArrayList<>();
        for(Object[] objects : listObjects){
            SemestreDto semestreDto = new SemestreDto();
            semestreDto.setCodigoSemestre(checkType(objects[0], String.class).orElse(null));
            MateriaDto materiaDto = new MateriaDto();
            materiaDto.setCodigo(checkType(objects[1], String.class).orElse(null));
            EstudianteDto estudianteDto = new EstudianteDto();
            estudianteDto.setCodigoEstudiante(checkType(objects[2], String.class).orElse(null));
            NotaDto notaDto = new NotaDto();
            notaDto.setCodigoNota(checkType(objects[3], String.class).orElse(null));
            NotaMateriaDto notaMateriaDto = new NotaMateriaDto();
            notaMateriaDto.setCodigoNotaEntityFk(notaDto);
            notaMateriaDto.setCodigoMateriaEntityFk(materiaDto);
            notaMateriaDto.setCodigoEstudianteEntityFk(estudianteDto);
            notaMateriaDto.setCodigoSemestreEntityFk(semestreDto);
            listNotasDto.add(notaMateriaDto);
        }
        return listNotasDto;
    }

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
            notaMateria.setNumeroCorte(notaMateriaDto.getNumeroCorte());
            notaMateria.setValorNota(BigDecimal.valueOf(0.0));
            listNotasEntity.add(notaMateria);
        }
        return listNotasEntity;
    }


}
