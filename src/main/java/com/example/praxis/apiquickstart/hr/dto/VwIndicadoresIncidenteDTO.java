package com.example.praxis.apiquickstart.hr.dto;

import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@UISchema(label = "Indicadores de Incidentes", readOnly = true)
public class VwIndicadoresIncidenteDTO {
    private Integer incidenteId;

    @UISchema(label = "Missão")
    private String missao;

    @UISchema(label = "Descrição")
    private String descricao;

    @UISchema(label = "Local")
    private String local;

    @UISchema(label = "Severidade")
    private String severidade;

    @UISchema(label = "Danos Civis", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT)
    private BigDecimal danosCivis;

    @UISchema(label = "Total Indenizações", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT)
    private BigDecimal totalIndenizacoes;

    @UISchema(label = "Total Pago", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT)
    private BigDecimal totalPago;

    @UISchema(label = "Total Pendente", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT)
    private BigDecimal totalPendente;

    @UISchema(label = "Ocorrido em", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime ocorridoEm;

    public Integer getIncidenteId() { return incidenteId; }
    public void setIncidenteId(Integer incidenteId) { this.incidenteId = incidenteId; }
    public String getMissao() { return missao; }
    public void setMissao(String missao) { this.missao = missao; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }
    public BigDecimal getDanosCivis() { return danosCivis; }
    public void setDanosCivis(BigDecimal danosCivis) { this.danosCivis = danosCivis; }
    public BigDecimal getTotalIndenizacoes() { return totalIndenizacoes; }
    public void setTotalIndenizacoes(BigDecimal totalIndenizacoes) { this.totalIndenizacoes = totalIndenizacoes; }
    public BigDecimal getTotalPago() { return totalPago; }
    public void setTotalPago(BigDecimal totalPago) { this.totalPago = totalPago; }
    public BigDecimal getTotalPendente() { return totalPendente; }
    public void setTotalPendente(BigDecimal totalPendente) { this.totalPendente = totalPendente; }
    public OffsetDateTime getOcorridoEm() { return ocorridoEm; }
    public void setOcorridoEm(OffsetDateTime ocorridoEm) { this.ocorridoEm = ocorridoEm; }
}

