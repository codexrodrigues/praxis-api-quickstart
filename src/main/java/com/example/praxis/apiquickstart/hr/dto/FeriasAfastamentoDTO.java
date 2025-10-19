package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.LocalDate;

public class FeriasAfastamentoDTO {
    private Integer id;

    @NotBlank
    @Size(max = 100)
    @UISchema(label = "Tipo", required = true, maxLength = 100, group = "Principal", order = 10)
    private String tipo;

    @NotNull
    @UISchema(label = "Data de Início", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Principal", order = 20)
    private LocalDate dataInicio;

    @NotNull
    @UISchema(label = "Data de Fim", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Principal", order = 30)
    private LocalDate dataFim;

    @UISchema(label = "Observações", controlType = FieldControlType.TEXTAREA, maxLength = 2000, group = "Principal", order = 40)
    private String observacoes;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
}
