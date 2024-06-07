package com.ms.grademaster.comons.dto;

import com.ms.grademaster.comons.entity.CertificadoEntity;
import com.ms.grademaster.comons.entity.DocenteEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DocenteCertificadoDto {

    private CertificadoDto codigoCertificadoEntityFk;

    private DocenteDto codigoDocenteEntityFk;

}