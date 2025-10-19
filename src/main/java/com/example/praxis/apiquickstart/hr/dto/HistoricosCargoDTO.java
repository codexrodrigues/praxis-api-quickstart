package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.LocalDate;

public class HistoricosCargoDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, required = true,
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS)
    private Integer funcionarioId;

    @NotNull
    @UISchema(label = "Cargo", controlType = FieldControlType.SELECT, required = true,
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.CARGOS)
    private Integer cargoId;

    @NotNull
    @UISchema(label = "Data Início", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, required = true)
    private LocalDate dataInicio;

    @UISchema(label = "Data Fim", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER)
    private LocalDate dataFim;

    @UISchema(label = "Observações", controlType = FieldControlType.TEXTAREA, maxLength = 2000)
    private String observacoes;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public Integer getCargoId() { return cargoId; }
    public void setCargoId(Integer cargoId) { this.cargoId = cargoId; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
}

