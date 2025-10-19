package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.AlocacaoStatus;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class EquipamentoAlocacaoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.EQUIPAMENTOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "equipamento.id")
    private Integer equipamentoId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private AlocacaoStatus status;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "inicio")
    private List<OffsetDateTime> inicioBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "fim")
    private List<OffsetDateTime> fimBetween;

    public Integer getEquipamentoId() { return equipamentoId; }
    public void setEquipamentoId(Integer equipamentoId) { this.equipamentoId = equipamentoId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public AlocacaoStatus getStatus() { return status; }
    public void setStatus(AlocacaoStatus status) { this.status = status; }
    public List<OffsetDateTime> getInicioBetween() { return inicioBetween; }
    public void setInicioBetween(List<OffsetDateTime> inicioBetween) { this.inicioBetween = inicioBetween; }
    public List<OffsetDateTime> getFimBetween() { return fimBetween; }
    public void setFimBetween(List<OffsetDateTime> fimBetween) { this.fimBetween = fimBetween; }
}
