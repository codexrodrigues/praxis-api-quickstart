package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.LicencaNivel;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.LocalDate;
import java.util.List;

public class LicencasOperacaoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.ACORDOS_REGULATORIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "acordo.id")
    private Integer acordoId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.EQUIPES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "equipe.id")
    private Integer equipeId;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private LicencaNivel nivel;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "validoDe")
    private List<LocalDate> validoDeBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "validoAte")
    private List<LocalDate> validoAteBetween;

    public Integer getAcordoId() { return acordoId; }
    public void setAcordoId(Integer acordoId) { this.acordoId = acordoId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public Integer getEquipeId() { return equipeId; }
    public void setEquipeId(Integer equipeId) { this.equipeId = equipeId; }
    public LicencaNivel getNivel() { return nivel; }
    public void setNivel(LicencaNivel nivel) { this.nivel = nivel; }
    public List<LocalDate> getValidoDeBetween() { return validoDeBetween; }
    public void setValidoDeBetween(List<LocalDate> validoDeBetween) { this.validoDeBetween = validoDeBetween; }
    public List<LocalDate> getValidoAteBetween() { return validoAteBetween; }
    public void setValidoAteBetween(List<LocalDate> validoAteBetween) { this.validoAteBetween = validoAteBetween; }
}
