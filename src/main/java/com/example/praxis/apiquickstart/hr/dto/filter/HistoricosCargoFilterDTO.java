package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.LocalDate;
import java.util.List;

public class HistoricosCargoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.CARGOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "cargo.id")
    private Integer cargoId;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "dataInicio")
    private List<LocalDate> dataInicioBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "dataFim")
    private List<LocalDate> dataFimBetween;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public Integer getCargoId() { return cargoId; }
    public void setCargoId(Integer cargoId) { this.cargoId = cargoId; }
    public List<LocalDate> getDataInicioBetween() { return dataInicioBetween; }
    public void setDataInicioBetween(List<LocalDate> dataInicioBetween) { this.dataInicioBetween = dataInicioBetween; }
    public List<LocalDate> getDataFimBetween() { return dataFimBetween; }
    public void setDataFimBetween(List<LocalDate> dataFimBetween) { this.dataFimBetween = dataFimBetween; }
}
