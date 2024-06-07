package com.ms.grademaster.comons.repository;

import com.ms.grademaster.comons.entity.CarreraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("carrera_repository_commons_entity")
public interface CarreraRepository extends JpaRepository<CarreraEntity, String> {

    Boolean existsByCodigoCarrera(String codigoCarrera);

}
