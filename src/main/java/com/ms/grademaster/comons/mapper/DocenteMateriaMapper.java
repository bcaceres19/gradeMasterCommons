package com.ms.grademaster.comons.mapper;

import com.ms.grademaster.comons.entity.*;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DocenteMateriaMapper {

    default List<DocenteMateriaEntity> objectsToEntity(List<MateriaEntity> materias, DocenteEntity docente, SemestreEntity semestre, EstadoEntity estado) {
        List<DocenteMateriaEntity> docenteMateriaEntityList = new ArrayList<>();
        for(MateriaEntity materiaEntity : materias){
            DocenteMateriaEntity docenteMateriaEntity = new DocenteMateriaEntity();
            DocenteMateriaId docenteMateriaId =  new DocenteMateriaId();
            docenteMateriaId.setCodigoDocenteEntityFk(docente.getCodigoDocente());
            docenteMateriaId.setCodigoMateriaEntityFk(materiaEntity.getCodigo());
            docenteMateriaId.setIdEstadoEntityFk(estado.getId());
            docenteMateriaId.setCodigoSemestreEntityFk(semestre.getCodigoSemestre());
            docenteMateriaEntity.setDocenteMateriaId(docenteMateriaId);
            docenteMateriaEntity.setIdEstadoEntityFk(estado);
            docenteMateriaEntity.setCodigoDocenteEntityFk(docente);
            docenteMateriaEntity.setCodigoMateriaEntityFk(materiaEntity);
            docenteMateriaEntity.setCodigoSemestreEntityFk(semestre);
            docenteMateriaEntityList.add(docenteMateriaEntity);
        }
        return docenteMateriaEntityList;
    }

}
