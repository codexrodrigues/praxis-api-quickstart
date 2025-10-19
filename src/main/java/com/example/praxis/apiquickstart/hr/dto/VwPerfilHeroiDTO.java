package com.example.praxis.apiquickstart.hr.dto;

import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;

@UISchema(label = "Perfil do Herói", readOnly = true)
public class VwPerfilHeroiDTO {
    private Integer funcionarioId;

    @UISchema(label = "Nome Completo")
    private String nomeCompleto;

    @UISchema(label = "Codinome")
    private String codinome;

    @UISchema(label = "Universo")
    private String universo;

    @UISchema(label = "Exposição Pública", type = FieldDataType.BOOLEAN)
    private Boolean exposicaoPublica;

    @UISchema(label = "Cargo")
    private String cargo;

    @UISchema(label = "Departamento")
    private String departamento;

    @UISchema(label = "Score Público", type = FieldDataType.NUMBER)
    private Integer scorePublico;

    @UISchema(label = "Score Governamental", type = FieldDataType.NUMBER)
    private Integer scoreGovernamental;

    @UISchema(label = "Score Médio", type = FieldDataType.NUMBER)
    private BigDecimal scoreMedio;

    @UISchema(label = "Habilidades")
    private String habilidades;

    @UISchema(label = "Equipe Principal")
    private String equipePrincipal;

    @UISchema(label = "Base Principal")
    private String basePrincipal;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getCodinome() { return codinome; }
    public void setCodinome(String codinome) { this.codinome = codinome; }
    public String getUniverso() { return universo; }
    public void setUniverso(String universo) { this.universo = universo; }
    public Boolean getExposicaoPublica() { return exposicaoPublica; }
    public void setExposicaoPublica(Boolean exposicaoPublica) { this.exposicaoPublica = exposicaoPublica; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public Integer getScorePublico() { return scorePublico; }
    public void setScorePublico(Integer scorePublico) { this.scorePublico = scorePublico; }
    public Integer getScoreGovernamental() { return scoreGovernamental; }
    public void setScoreGovernamental(Integer scoreGovernamental) { this.scoreGovernamental = scoreGovernamental; }
    public BigDecimal getScoreMedio() { return scoreMedio; }
    public void setScoreMedio(BigDecimal scoreMedio) { this.scoreMedio = scoreMedio; }
    public String getHabilidades() { return habilidades; }
    public void setHabilidades(String habilidades) { this.habilidades = habilidades; }
    public String getEquipePrincipal() { return equipePrincipal; }
    public void setEquipePrincipal(String equipePrincipal) { this.equipePrincipal = equipePrincipal; }
    public String getBasePrincipal() { return basePrincipal; }
    public void setBasePrincipal(String basePrincipal) { this.basePrincipal = basePrincipal; }
}

