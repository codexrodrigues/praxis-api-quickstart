package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

public class BaseAcessoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.BASES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "base.id")
    private Integer baseId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nivelAcesso;

    @UISchema(type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Boolean ativo;

    public Integer getBaseId() { return baseId; }
    public void setBaseId(Integer baseId) { this.baseId = baseId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(String nivelAcesso) { this.nivelAcesso = nivelAcesso; }
    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
}
