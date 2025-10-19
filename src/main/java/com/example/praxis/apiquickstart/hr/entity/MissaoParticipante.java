package com.example.praxis.apiquickstart.hr.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "missao_participantes", schema = "public", indexes = {
        @Index(name = "idx_miss_part_missao", columnList = "missao_id"),
        @Index(name = "idx_miss_part_func", columnList = "funcionario_id")
}, uniqueConstraints = {
        @UniqueConstraint(name = "missao_participantes_missao_id_funcionario_id_key", columnNames = {"missao_id", "funcionario_id"})
})
public class MissaoParticipante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "missao_id", nullable = false)
    private Missao missao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @Enumerated(EnumType.STRING)
    @Column(name = "papel")
    private com.example.praxis.apiquickstart.hr.enums.PapelMissao papel;

    @Enumerated(EnumType.STRING)
    @Column(name = "resultado")
    private com.example.praxis.apiquickstart.hr.enums.ResultadoMissao resultado;

}
