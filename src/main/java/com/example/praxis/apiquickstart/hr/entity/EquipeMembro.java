package com.example.praxis.apiquickstart.hr.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.praxisplatform.uischema.service.base.annotation.DefaultSortColumn;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "equipe_membros", schema = "public", indexes = {
        @Index(name = "idx_eq_membros_equipe", columnList = "equipe_id"),
        @Index(name = "idx_eq_membros_func", columnList = "funcionario_id")
}, uniqueConstraints = {
        @UniqueConstraint(name = "equipe_membros_equipe_id_funcionario_id_data_entrada_key", columnNames = {"equipe_id", "funcionario_id", "data_entrada"})
})
public class EquipeMembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "equipe_id", nullable = false)
    private Equipe equipe;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @Enumerated(EnumType.STRING)
    @Column(name = "papel")
    private com.example.praxis.apiquickstart.hr.enums.PapelEquipe papel;

    @NotNull
    @ColumnDefault("CURRENT_DATE")
    @Column(name = "data_entrada", nullable = false)
    @DefaultSortColumn(priority = 1, ascending = false)
    private LocalDate dataEntrada;

    @Column(name = "data_saida")
    private LocalDate dataSaida;

}
