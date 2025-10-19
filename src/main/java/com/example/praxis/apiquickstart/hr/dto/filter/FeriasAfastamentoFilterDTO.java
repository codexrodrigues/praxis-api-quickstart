package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.LocalDate;
import java.util.List;

public class FeriasAfastamentoFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String tipo;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "dataInicio")
    private List<LocalDate> dataInicioBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "dataFim")
    private List<LocalDate> dataFimBetween;

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public List<LocalDate> getDataInicioBetween() { return dataInicioBetween; }
    public void setDataInicioBetween(List<LocalDate> dataInicioBetween) { this.dataInicioBetween = dataInicioBetween; }
    public List<LocalDate> getDataFimBetween() { return dataFimBetween; }
    public void setDataFimBetween(List<LocalDate> dataFimBetween) { this.dataFimBetween = dataFimBetween; }
}
