package com.example.praxis.apiquickstart.hr.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.praxisplatform.uischema.service.base.annotation.DefaultSortColumn;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "base_acessos", schema = "public", indexes = {
        @Index(name = "idx_base_acessos_base", columnList = "base_id"),
        @Index(name = "idx_base_acessos_func", columnList = "funcionario_id"),
        @Index(name = "idx_base_acessos_nivel", columnList = "nivel_acesso")
}, uniqueConstraints = {
        @UniqueConstraint(name = "base_acessos_base_id_funcionario_id_key", columnNames = {"base_id", "funcionario_id"})
})
public class BaseAcesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "base_id", nullable = false)
    private Base base;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @NotNull
    @Column(name = "nivel_acesso", nullable = false, length = Integer.MAX_VALUE)
    @DefaultSortColumn(priority = 1, ascending = true)
    private String nivelAcesso;

    @NotNull
    @ColumnDefault("true")
    @Column(name = "ativo", nullable = false)
    private Boolean ativo = false;

}
