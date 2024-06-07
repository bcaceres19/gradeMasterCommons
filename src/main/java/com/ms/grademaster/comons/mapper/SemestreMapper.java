package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.EstudianteDto;
import com.ms.grademaster.comons.dto.SemestreDto;
import com.ms.grademaster.comons.entity.EstudianteEntity;
import com.ms.grademaster.comons.entity.SemestreEntity;
import org.mapstruct.Mapper;

import java.time.LocalDate;
import java.util.List;

import static com.ms.grademaster.comons.utils.utilities.Utilidades.checkType;

@Mapper(componentModel = "spring")
public interface SemestreMapper {

    SemestreDto entityToDto(SemestreEntity entity);

    SemestreEntity dtoToEntity(SemestreDto dto);

    default SemestreDto objectToDto(List<Object[]> data) {
        SemestreDto semestreDto = new SemestreDto();
        for(Object[] objeto : data){
            semestreDto.setCodigoSemestre(checkType(objeto[0], String.class).orElse(null));
            semestreDto.setFechaInicio(checkType(objeto[1], LocalDate.class).orElse(null));
            semestreDto.setFechaFin(checkType(objeto[2], LocalDate.class).orElse(null));
        }
        if(data.isEmpty()){
            return null;
        }
        return semestreDto;
    }

}
