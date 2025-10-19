package com.example.praxis.apiquickstart.hr.dto.filter;

import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.math.BigDecimal;
import java.util.List;

public class VwPerfilHeroiFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Integer funcionarioId;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nomeCompleto;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String codinome;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String universo;

    @UISchema(type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Boolean exposicaoPublica;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String cargo;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String departamento;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "scorePublico")
    private List<Integer> scorePublicoBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "scoreGovernamental")
    private List<Integer> scoreGovernamentalBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "scoreMedio")
    private List<BigDecimal> scoreMedioBetween;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String habilidades;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String equipePrincipal;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
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
    public List<Integer> getScorePublicoBetween() { return scorePublicoBetween; }
    public void setScorePublicoBetween(List<Integer> scorePublicoBetween) { this.scorePublicoBetween = scorePublicoBetween; }
    public List<Integer> getScoreGovernamentalBetween() { return scoreGovernamentalBetween; }
    public void setScoreGovernamentalBetween(List<Integer> scoreGovernamentalBetween) { this.scoreGovernamentalBetween = scoreGovernamentalBetween; }
    public List<BigDecimal> getScoreMedioBetween() { return scoreMedioBetween; }
    public void setScoreMedioBetween(List<BigDecimal> scoreMedioBetween) { this.scoreMedioBetween = scoreMedioBetween; }
    public String getHabilidades() { return habilidades; }
    public void setHabilidades(String habilidades) { this.habilidades = habilidades; }
    public String getEquipePrincipal() { return equipePrincipal; }
    public void setEquipePrincipal(String equipePrincipal) { this.equipePrincipal = equipePrincipal; }
    public String getBasePrincipal() { return basePrincipal; }
    public void setBasePrincipal(String basePrincipal) { this.basePrincipal = basePrincipal; }
}
