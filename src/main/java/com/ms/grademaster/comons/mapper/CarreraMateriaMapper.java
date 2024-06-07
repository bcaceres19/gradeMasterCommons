package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.dto.CarreraDto;
import com.ms.grademaster.comons.dto.MateriaDto;
import com.ms.grademaster.comons.entity.CarreraEntity;
import com.ms.grademaster.comons.entity.CarreraMateriaEntity;
import com.ms.grademaster.comons.entity.CarreraMateriaId;
import com.ms.grademaster.comons.entity.MateriaEntity;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CarreraMateriaMapper {

    default List<CarreraMateriaEntity> listMateriasAndIdCarreraToListEntity(CarreraEntity carrera, List<MateriaEntity> materias){
        List<CarreraMateriaEntity> carreraMateriaEntities = new ArrayList<>();
        for(MateriaEntity materiaEntity : materias){
            CarreraMateriaId ids = new CarreraMateriaId();
            ids.setCodigoCarreraFk(carrera.getCodigoCarrera());
            ids.setCodigoMateriaFk(materiaEntity.getCodigo());
            CarreraMateriaEntity carreraMateriaEntity = new CarreraMateriaEntity();
            carreraMateriaEntity.setCarreraMateriaId(ids);
            carreraMateriaEntity.setMateriaEntity(materiaEntity);
            carreraMateriaEntity.setCarreraEntity(carrera);
            carreraMateriaEntities.add(carreraMateriaEntity);
        }
        return carreraMateriaEntities;
    }


}
