package com.ms.grademaster.comons.repository;

import com.ms.grademaster.comons.entity.MateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("materia_repository_commons_entity")
public interface MateriaRepository extends JpaRepository<MateriaEntity, String> {

    Boolean existsByCodigo(String codigo);

}
