package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.AdministrativoDto;
import com.ms.grademaster.comons.entity.AdministrativoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdministrativoMapper {

    AdministrativoEntity dtoToEntity(AdministrativoDto dto);

    AdministrativoDto entityToDto(AdministrativoEntity entity);

}
