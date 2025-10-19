package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

public class IdentidadeSecretaFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String codinome;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String universo;

    @UISchema(type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Boolean exposicaoPublica;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getCodinome() { return codinome; }
    public void setCodinome(String codinome) { this.codinome = codinome; }
    public String getUniverso() { return universo; }
    public void setUniverso(String universo) { this.universo = universo; }
    public Boolean getExposicaoPublica() { return exposicaoPublica; }
    public void setExposicaoPublica(Boolean exposicaoPublica) { this.exposicaoPublica = exposicaoPublica; }
}
