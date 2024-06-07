package com.ms.grademaster.comons.repository;

import com.ms.grademaster.comons.entity.NotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("nota_repository_commons_entity")
public interface NotaRepository extends JpaRepository<NotaEntity, String> {

    Boolean existsByCodigoNota(String codigoNota);

}
