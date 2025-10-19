package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.util.List;

public class FuncionarioHabilidadeFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.HABILIDADES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "habilidade.id")
    private Integer habilidadeId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "proficiencia")
    private List<Integer> proficienciaBetween;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String origem;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public Integer getHabilidadeId() { return habilidadeId; }
    public void setHabilidadeId(Integer habilidadeId) { this.habilidadeId = habilidadeId; }
    public List<Integer> getProficienciaBetween() { return proficienciaBetween; }
    public void setProficienciaBetween(List<Integer> proficienciaBetween) { this.proficienciaBetween = proficienciaBetween; }
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
}
