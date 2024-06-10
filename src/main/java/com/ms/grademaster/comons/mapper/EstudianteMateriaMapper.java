package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.entity.*;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EstudianteMateriaMapper {

    default List<EstudianteMateriaEntity> objectsToEntity(List<MateriaEntity> materias, EstudianteEntity estudiante) {
        List<EstudianteMateriaEntity> estudianteMateriaEntityList = new ArrayList<>();
        for(MateriaEntity materiaEntity : materias){
            EstudianteMateriaEntity estudianteMateriaEntity = new EstudianteMateriaEntity();
            EstudianteMateriaId estudianteMateriaId =  new EstudianteMateriaId();
            estudianteMateriaId.setCodigoEstudianteEntityFk(estudiante.getCodigoEstudiante());
            estudianteMateriaId.setCodigoMateriaEntityFk(materiaEntity.getCodigo());
            estudianteMateriaEntity.setCodigoEstudianteEntityFk(estudiante);
            estudianteMateriaEntity.setCodigoMateriaEntityFk(materiaEntity);
            estudianteMateriaEntity.setEstudianteMateriaId(estudianteMateriaId);
            estudianteMateriaEntityList.add(estudianteMateriaEntity);
        }
        return estudianteMateriaEntityList;
    }

}
