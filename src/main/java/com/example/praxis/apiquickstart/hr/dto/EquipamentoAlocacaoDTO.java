package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.AlocacaoStatus;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

public class EquipamentoAlocacaoDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Equipamento", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.EQUIPAMENTOS + "/options/filter", required = true)
    private Integer equipamentoId;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter", required = true)
    private Integer funcionarioId;

    @NotNull
    @UISchema(label = "Início", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER, required = true)
    private OffsetDateTime inicio;

    @UISchema(label = "Fim", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime fim;

    @UISchema(label = "Status", controlType = FieldControlType.SELECT)
    private AlocacaoStatus status;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getEquipamentoId() { return equipamentoId; }
    public void setEquipamentoId(Integer equipamentoId) { this.equipamentoId = equipamentoId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public OffsetDateTime getInicio() { return inicio; }
    public void setInicio(OffsetDateTime inicio) { this.inicio = inicio; }
    public OffsetDateTime getFim() { return fim; }
    public void setFim(OffsetDateTime fim) { this.fim = fim; }
    public AlocacaoStatus getStatus() { return status; }
    public void setStatus(AlocacaoStatus status) { this.status = status; }
}
