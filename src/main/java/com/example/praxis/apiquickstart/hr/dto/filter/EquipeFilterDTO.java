package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.EquipeStatus;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

public class EquipeFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.BASES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "basePrincipal.id")
    private Integer basePrincipalId;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private EquipeStatus status;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Integer getBasePrincipalId() { return basePrincipalId; }
    public void setBasePrincipalId(Integer basePrincipalId) { this.basePrincipalId = basePrincipalId; }
    public EquipeStatus getStatus() { return status; }
    public void setStatus(EquipeStatus status) { this.status = status; }
}
