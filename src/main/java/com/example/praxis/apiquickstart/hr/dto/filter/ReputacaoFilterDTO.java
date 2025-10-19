package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class ReputacaoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "scorePublico")
    private List<Integer> scorePublicoBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "scoreGovernamental")
    private List<Integer> scoreGovernamentalBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "atualizadoEm")
    private List<OffsetDateTime> atualizadoEmBetween;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public List<Integer> getScorePublicoBetween() { return scorePublicoBetween; }
    public void setScorePublicoBetween(List<Integer> scorePublicoBetween) { this.scorePublicoBetween = scorePublicoBetween; }
    public List<Integer> getScoreGovernamentalBetween() { return scoreGovernamentalBetween; }
    public void setScoreGovernamentalBetween(List<Integer> scoreGovernamentalBetween) { this.scoreGovernamentalBetween = scoreGovernamentalBetween; }
    public List<OffsetDateTime> getAtualizadoEmBetween() { return atualizadoEmBetween; }
    public void setAtualizadoEmBetween(List<OffsetDateTime> atualizadoEmBetween) { this.atualizadoEmBetween = atualizadoEmBetween; }
}
