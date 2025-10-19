package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HistoricoSalarialDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, required = true,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    @NotNull
    @DecimalMin("0.00")
    @UISchema(label = "Salário", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, required = true)
    private BigDecimal salario;

    @NotNull
    @UISchema(label = "Data Início", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, required = true)
    private LocalDate dataInicio;

    @UISchema(label = "Data Fim", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER)
    private LocalDate dataFim;

    @UISchema(label = "Motivo", controlType = FieldControlType.TEXTAREA, maxLength = 2000)
    private String motivo;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public BigDecimal getSalario() { return salario; }
    public void setSalario(BigDecimal salario) { this.salario = salario; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}
