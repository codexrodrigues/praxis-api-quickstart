package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;

public class IndenizacaoDTO {
    private Integer id;

    @NotNull
    @DecimalMin("0.00")
    @UISchema(label = "Valor", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, required = true)
    private BigDecimal valor;

    @NotNull
    @UISchema(label = "Pago", type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX, required = true)
    private Boolean pago;

    @UISchema(label = "Seguradora")
    private String seguradora;

    @UISchema(label = "Número do Processo")
    private String processoNum;

    @NotNull
    @UISchema(label = "Incidente", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.INCIDENTES + "/options/filter", required = true)
    private Integer incidenteId;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
    public Boolean getPago() { return pago; }
    public void setPago(Boolean pago) { this.pago = pago; }
    public String getSeguradora() { return seguradora; }
    public void setSeguradora(String seguradora) { this.seguradora = seguradora; }
    public String getProcessoNum() { return processoNum; }
    public void setProcessoNum(String processoNum) { this.processoNum = processoNum; }
    public Integer getIncidenteId() { return incidenteId; }
    public void setIncidenteId(Integer incidenteId) { this.incidenteId = incidenteId; }
}
