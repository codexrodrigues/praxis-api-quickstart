package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

public class ReputacaoDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter", required = true)
    private Integer funcionarioId;

    @UISchema(label = "Score Público", type = FieldDataType.NUMBER)
    private Integer scorePublico;

    @UISchema(label = "Score Governamental", type = FieldDataType.NUMBER)
    private Integer scoreGovernamental;

    @UISchema(label = "Atualizado Em", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime atualizadoEm;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public Integer getScorePublico() { return scorePublico; }
    public void setScorePublico(Integer scorePublico) { this.scorePublico = scorePublico; }
    public Integer getScoreGovernamental() { return scoreGovernamental; }
    public void setScoreGovernamental(Integer scoreGovernamental) { this.scoreGovernamental = scoreGovernamental; }
    public OffsetDateTime getAtualizadoEm() { return atualizadoEm; }
    public void setAtualizadoEm(OffsetDateTime atualizadoEm) { this.atualizadoEm = atualizadoEm; }
}
