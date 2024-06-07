package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.NotaDto;
import com.ms.grademaster.comons.entity.NotaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotaMapper {

    NotaEntity dtoToEntity(NotaDto dto);

    List<NotaEntity> listDtoToListEntity(List<NotaDto> dtos);

    List<NotaDto> listEntityToListDto(List<NotaEntity> entities);

}
