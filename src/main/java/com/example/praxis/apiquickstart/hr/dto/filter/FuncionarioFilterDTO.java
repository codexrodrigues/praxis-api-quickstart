package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.LocalDate;
import java.util.List;

public class FuncionarioFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nomeCompleto;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String cpf;

    @UISchema(type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Boolean ativo;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.CARGOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "cargo.id")
    private Integer cargoId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.DEPARTAMENTOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "departamento.id")
    private Integer departamentoId;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "dataAdmissao")
    private List<LocalDate> dataAdmissaoRange;

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
    public Integer getCargoId() { return cargoId; }
    public void setCargoId(Integer cargoId) { this.cargoId = cargoId; }
    public Integer getDepartamentoId() { return departamentoId; }
    public void setDepartamentoId(Integer departamentoId) { this.departamentoId = departamentoId; }
    public List<LocalDate> getDataAdmissaoRange() { return dataAdmissaoRange; }
    public void setDataAdmissaoRange(List<LocalDate> dataAdmissaoRange) { this.dataAdmissaoRange = dataAdmissaoRange; }
}
