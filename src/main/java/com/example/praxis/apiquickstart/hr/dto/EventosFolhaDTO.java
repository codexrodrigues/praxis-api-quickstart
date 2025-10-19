package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;

public class EventosFolhaDTO {
    private Integer id;

    @NotBlank
    @Size(max = 255)
    @UISchema(label = "Descrição", required = true, maxLength = 255, group = "Principal", order = 10)
    private String descricao;

    @NotBlank
    @Size(max = 100)
    @UISchema(label = "Tipo", required = true, maxLength = 100, group = "Principal", order = 20)
    private String tipo;

    @NotNull
    @DecimalMin("0.00")
    @UISchema(label = "Valor", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, group = "Principal", order = 30)
    private BigDecimal valor;

    @NotNull
    @UISchema(label = "Folha de Pagamento", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FOLHAS_PAGAMENTO + "/options/filter")
    private Integer folhaPagamentoId;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public Integer getFolhaPagamentoId() { return folhaPagamentoId; }
    public void setFolhaPagamentoId(Integer folhaPagamentoId) { this.folhaPagamentoId = folhaPagamentoId; }
}
