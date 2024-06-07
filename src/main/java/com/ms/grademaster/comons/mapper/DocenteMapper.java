package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.DocenteDto;
import com.ms.grademaster.comons.entity.DocenteEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DocenteMapper {

    DocenteDto entityToDto(DocenteEntity entity);

    DocenteEntity dtoToEntity(DocenteDto dto);

    List<DocenteDto> listEntityToListDto(List<DocenteEntity> entityList);

}
