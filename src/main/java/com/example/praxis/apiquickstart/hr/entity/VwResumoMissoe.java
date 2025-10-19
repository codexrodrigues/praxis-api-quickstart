package com.example.praxis.apiquickstart.hr.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

import java.time.OffsetDateTime;

/**
 * Mapping for DB view
 */
@lombok.Getter
@lombok.Setter
@Entity
@Immutable
@Table(name = "vw_resumo_missoes", schema = "public")
public class VwResumoMissoe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "missao_id")
    private Integer missaoId;

    @Column(name = "titulo", length = Integer.MAX_VALUE)
    private String titulo;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "prioridade", length = Integer.MAX_VALUE)
    private String prioridade;

    @Column(name = "local", length = Integer.MAX_VALUE)
    private String local;

    @Column(name = "ameaca", length = Integer.MAX_VALUE)
    private String ameaca;

    @Column(name = "qtd_herois")
    private Long qtdHerois;

    @Column(name = "qtd_eventos")
    private Long qtdEventos;

    @Column(name = "primeira_acao")
    private OffsetDateTime primeiraAcao;

    @Column(name = "ultima_acao")
    private OffsetDateTime ultimaAcao;

}
