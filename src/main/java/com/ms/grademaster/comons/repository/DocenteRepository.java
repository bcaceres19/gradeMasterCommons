package com.ms.grademaster.comons.repository;

import com.ms.grademaster.comons.entity.DocenteEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("docente_repository_commons_entity")
public interface DocenteRepository extends JpaRepository<DocenteEntity, String> {

    Boolean existsByCodigoDocente(String codigoDocente);

}
