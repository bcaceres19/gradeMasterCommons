package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.EstadoDto;
import com.ms.grademaster.comons.entity.EstadoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoMapper {

    EstadoDto entityToDto(EstadoEntity entity);

    EstadoEntity dtoToEntity(EstadoDto dto);

    List<EstadoDto> listEntityToListDto(List<EstadoEntity> estadoList);

}
