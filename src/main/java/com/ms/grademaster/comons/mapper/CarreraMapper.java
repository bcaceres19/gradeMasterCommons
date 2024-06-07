package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.CarreraDto;
import com.ms.grademaster.comons.entity.CarreraEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarreraMapper {

    CarreraEntity dtoToEntity(CarreraDto dto);

    CarreraDto entityToDto(CarreraEntity entity);

    List<CarreraDto> listEntityToListDto(List<CarreraEntity> entity);

}
