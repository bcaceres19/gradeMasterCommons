package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "DocenteCertificado")
public class DocenteCertificadoEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_certificado_fk", nullable = false)
    private CertificadoEntity codigoCertificadoEntityFk;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_docente_fk", nullable = false)
    private DocenteEntity codigoDocenteEntityFk;

}