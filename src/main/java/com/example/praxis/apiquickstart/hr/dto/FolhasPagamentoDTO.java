package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FolhasPagamentoDTO {
    private Integer id;

    @NotNull
    @Min(1900)
    @Max(2100)
    @UISchema(label = "Ano", required = true, group = "Competência", order = 10)
    private Integer ano;

    @NotNull
    @Min(1)
    @Max(12)
    @UISchema(label = "Mês", required = true, group = "Competência", order = 20)
    private Integer mes;

    @NotNull
    @DecimalMin("0.00")
    @UISchema(label = "Salário Bruto", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, group = "Valores", order = 10)
    private BigDecimal salarioBruto;

    @NotNull
    @DecimalMin("0.00")
    @UISchema(label = "Total Descontos", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, group = "Valores", order = 20)
    private BigDecimal totalDescontos;

    @NotNull
    @DecimalMin("0.00")
    @UISchema(label = "Salário Líquido", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, group = "Valores", order = 30)
    private BigDecimal salarioLiquido;

    @NotNull
    @UISchema(label = "Data de Pagamento", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Competência", order = 30)
    private LocalDate dataPagamento;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }
    public Integer getMes() { return mes; }
    public void setMes(Integer mes) { this.mes = mes; }
    public BigDecimal getSalarioBruto() { return salarioBruto; }
    public void setSalarioBruto(BigDecimal salarioBruto) { this.salarioBruto = salarioBruto; }
    public BigDecimal getTotalDescontos() { return totalDescontos; }
    public void setTotalDescontos(BigDecimal totalDescontos) { this.totalDescontos = totalDescontos; }
    public BigDecimal getSalarioLiquido() { return salarioLiquido; }
    public void setSalarioLiquido(BigDecimal salarioLiquido) { this.salarioLiquido = salarioLiquido; }
    public LocalDate getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(LocalDate dataPagamento) { this.dataPagamento = dataPagamento; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
}
