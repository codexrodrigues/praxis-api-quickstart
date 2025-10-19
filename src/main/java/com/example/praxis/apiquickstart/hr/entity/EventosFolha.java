package com.example.praxis.apiquickstart.hr.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.praxisplatform.uischema.annotation.OptionLabel;

import java.math.BigDecimal;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "eventos_folha", schema = "public")
public class EventosFolha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "descricao", nullable = false, length = Integer.MAX_VALUE)
    private String descricao;

    @NotNull
    @Column(name = "tipo", nullable = false, length = Integer.MAX_VALUE)
    private String tipo;

    @NotNull
    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "folha_pagamento_id", nullable = false)
    private FolhasPagamento folhaPagamento;

    @OptionLabel
    public String getLabel() { return descricao; }
}
