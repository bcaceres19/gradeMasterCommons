package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.EstudianteDto;
import com.ms.grademaster.comons.entity.EstudianteEntity;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

import static com.ms.grademaster.comons.utils.utilities.Utilidades.checkType;

@Mapper(componentModel = "spring")
public interface EstudianteMapper {

    EstudianteEntity dtoToEntity(EstudianteDto estudianteDto);

    EstudianteDto entityToDto(EstudianteEntity estudianteDto);

    default List<EstudianteDto> listObjectsToListDto(List<Object[]> dataObject){
        List<EstudianteDto> listaEstudiantes = new ArrayList<>();
        for(Object[] object : dataObject){
            EstudianteDto estudianteDto = new EstudianteDto();
            estudianteDto.setCodigoEstudiante(checkType(object[0], String.class).orElse(null));
            estudianteDto.setNombres(checkType(object[1], String.class).orElse(null));
            estudianteDto.setApellidos(checkType(object[2], String.class).orElse(null));
            listaEstudiantes.add(estudianteDto);
        }
        return listaEstudiantes;
    }

}
