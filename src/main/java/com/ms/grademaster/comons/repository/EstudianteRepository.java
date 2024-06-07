package com.ms.grademaster.comons.repository;

import com.ms.grademaster.comons.entity.EstudianteEntity;
import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("estuidante_reposiotory_commons_entity")
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, String> {

    Boolean existsByCodigoEstudiante(String codigoEstudiante);

}
