package com.ms.grademaster.comons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(schema = "dbo", name = "nota_materia")
@NoArgsConstructor
public class NotaMateriaEntity {

    @EmbeddedId
    private NotaMateriaId notaMateriaId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoSemestreEntityFk")
    @JoinColumn(name = "codigo_semestre_fk", nullable = false)
    private SemestreEntity codigoSemestreEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoMateriaEntityFk")
    @JoinColumn(name = "codigo_materia_fk", nullable = false)
    private MateriaEntity codigoMateriaEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoEstudianteEntityFk")
    @JoinColumn(name = "codigo_estudiante_fk", nullable = false)
    private EstudianteEntity codigoEstudianteEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("codigoNotaEntityFk")
    @JoinColumn(name = "codigo_nota_fk", nullable = false)
    private NotaEntity codigoNotaEntityFk;

    @Column(name = "valor_nota", nullable = false, precision = 2, scale = 2)
    private BigDecimal valorNota;

    @Column(name = "numero_corte", nullable = false)
    private Long numeroCorte;

    public NotaMateriaEntity(BigDecimal valorNota) {
        this.valorNota = valorNota;
    }

    public NotaMateriaEntity(SemestreEntity codigoSemestreEntityFk, MateriaEntity codigoMateriaEntityFk, EstudianteEntity codigoEstudianteEntityFk, NotaEntity codigoNotaEntityFk) {
        this.codigoSemestreEntityFk = codigoSemestreEntityFk;
        this.codigoMateriaEntityFk = codigoMateriaEntityFk;
        this.codigoEstudianteEntityFk = codigoEstudianteEntityFk;
        this.codigoNotaEntityFk = codigoNotaEntityFk;
    }
}