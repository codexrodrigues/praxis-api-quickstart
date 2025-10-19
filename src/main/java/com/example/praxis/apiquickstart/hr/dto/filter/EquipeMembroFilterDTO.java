package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.PapelEquipe;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.LocalDate;
import java.util.List;

public class EquipeMembroFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.EQUIPES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "equipe.id")
    private Integer equipeId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private PapelEquipe papel;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "dataEntrada")
    private List<LocalDate> dataEntradaBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "dataSaida")
    private List<LocalDate> dataSaidaBetween;

    public Integer getEquipeId() { return equipeId; }
    public void setEquipeId(Integer equipeId) { this.equipeId = equipeId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public PapelEquipe getPapel() { return papel; }
    public void setPapel(PapelEquipe papel) { this.papel = papel; }
    public List<LocalDate> getDataEntradaBetween() { return dataEntradaBetween; }
    public void setDataEntradaBetween(List<LocalDate> dataEntradaBetween) { this.dataEntradaBetween = dataEntradaBetween; }
    public List<LocalDate> getDataSaidaBetween() { return dataSaidaBetween; }
    public void setDataSaidaBetween(List<LocalDate> dataSaidaBetween) { this.dataSaidaBetween = dataSaidaBetween; }
}
