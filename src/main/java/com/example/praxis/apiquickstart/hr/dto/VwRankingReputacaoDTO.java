package com.example.praxis.apiquickstart.hr.dto;

import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;

@UISchema(label = "Ranking de Reputação", readOnly = true)
public class VwRankingReputacaoDTO {
    private Integer funcionarioId;

    @UISchema(label = "Nome Completo")
    private String nomeCompleto;

    @UISchema(label = "Codinome")
    private String codinome;

    @UISchema(label = "Equipe")
    private String equipe;

    @UISchema(label = "Score Público", type = FieldDataType.NUMBER)
    private Integer scorePublico;

    @UISchema(label = "Score Governamental", type = FieldDataType.NUMBER)
    private Integer scoreGovernamental;

    @UISchema(label = "Média", type = FieldDataType.NUMBER)
    private BigDecimal media;

    @UISchema(label = "Posição", type = FieldDataType.NUMBER)
    private Long posicao;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getCodinome() { return codinome; }
    public void setCodinome(String codinome) { this.codinome = codinome; }
    public String getEquipe() { return equipe; }
    public void setEquipe(String equipe) { this.equipe = equipe; }
    public Integer getScorePublico() { return scorePublico; }
    public void setScorePublico(Integer scorePublico) { this.scorePublico = scorePublico; }
    public Integer getScoreGovernamental() { return scoreGovernamental; }
    public void setScoreGovernamental(Integer scoreGovernamental) { this.scoreGovernamental = scoreGovernamental; }
    public BigDecimal getMedia() { return media; }
    public void setMedia(BigDecimal media) { this.media = media; }
    public Long getPosicao() { return posicao; }
    public void setPosicao(Long posicao) { this.posicao = posicao; }
}

