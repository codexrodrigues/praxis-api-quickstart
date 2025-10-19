package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.math.BigDecimal;
import java.util.List;

public class VwRankingReputacaoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
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
    private String equipe;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "scorePublico")
    private List<Integer> scorePublicoBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "scoreGovernamental")
    private List<Integer> scoreGovernamentalBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "media")
    private List<BigDecimal> mediaBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "posicao")
    private List<Long> posicaoBetween;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getCodinome() { return codinome; }
    public void setCodinome(String codinome) { this.codinome = codinome; }
    public String getEquipe() { return equipe; }
    public void setEquipe(String equipe) { this.equipe = equipe; }
    public List<Integer> getScorePublicoBetween() { return scorePublicoBetween; }
    public void setScorePublicoBetween(List<Integer> scorePublicoBetween) { this.scorePublicoBetween = scorePublicoBetween; }
    public List<Integer> getScoreGovernamentalBetween() { return scoreGovernamentalBetween; }
    public void setScoreGovernamentalBetween(List<Integer> scoreGovernamentalBetween) { this.scoreGovernamentalBetween = scoreGovernamentalBetween; }
    public List<BigDecimal> getMediaBetween() { return mediaBetween; }
    public void setMediaBetween(List<BigDecimal> mediaBetween) { this.mediaBetween = mediaBetween; }
    public List<Long> getPosicaoBetween() { return posicaoBetween; }
    public void setPosicaoBetween(List<Long> posicaoBetween) { this.posicaoBetween = posicaoBetween; }
}
