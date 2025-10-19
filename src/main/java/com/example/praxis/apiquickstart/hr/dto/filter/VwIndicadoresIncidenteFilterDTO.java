package com.example.praxis.apiquickstart.hr.dto.filter;

import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.NumericFormat;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class VwIndicadoresIncidenteFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Integer incidenteId;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String missao;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String descricao;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String local;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String severidade;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER,
            numericFormat = NumericFormat.CURRENCY, numericStep = "0.01")
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "danosCivis")
    private List<BigDecimal> danosCivisBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER,
            numericFormat = NumericFormat.CURRENCY, numericStep = "0.01")
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "totalIndenizacoes")
    private List<BigDecimal> totalIndenizacoesBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER,
            numericFormat = NumericFormat.CURRENCY, numericStep = "0.01")
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "totalPago")
    private List<BigDecimal> totalPagoBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER,
            numericFormat = NumericFormat.CURRENCY, numericStep = "0.01")
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "totalPendente")
    private List<BigDecimal> totalPendenteBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "ocorridoEm")
    private List<OffsetDateTime> ocorridoEmBetween;

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
    public List<BigDecimal> getDanosCivisBetween() { return danosCivisBetween; }
    public void setDanosCivisBetween(List<BigDecimal> danosCivisBetween) { this.danosCivisBetween = danosCivisBetween; }
    public List<BigDecimal> getTotalIndenizacoesBetween() { return totalIndenizacoesBetween; }
    public void setTotalIndenizacoesBetween(List<BigDecimal> totalIndenizacoesBetween) { this.totalIndenizacoesBetween = totalIndenizacoesBetween; }
    public List<BigDecimal> getTotalPagoBetween() { return totalPagoBetween; }
    public void setTotalPagoBetween(List<BigDecimal> totalPagoBetween) { this.totalPagoBetween = totalPagoBetween; }
    public List<BigDecimal> getTotalPendenteBetween() { return totalPendenteBetween; }
    public void setTotalPendenteBetween(List<BigDecimal> totalPendenteBetween) { this.totalPendenteBetween = totalPendenteBetween; }
    public List<OffsetDateTime> getOcorridoEmBetween() { return ocorridoEmBetween; }
    public void setOcorridoEmBetween(List<OffsetDateTime> ocorridoEmBetween) { this.ocorridoEmBetween = ocorridoEmBetween; }
}
