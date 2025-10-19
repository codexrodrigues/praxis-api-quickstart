package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.NumericFormat;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.math.BigDecimal;
import java.util.List;

public class EventosFolhaFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String descricao;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String tipo;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER,
            numericFormat = NumericFormat.CURRENCY, numericStep = "0.01")
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "valor")
    private List<BigDecimal> valorBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FOLHAS_PAGAMENTO + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "folhaPagamento.id")
    private Integer folhaPagamentoId;

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public List<BigDecimal> getValorBetween() { return valorBetween; }
    public void setValorBetween(List<BigDecimal> valorBetween) { this.valorBetween = valorBetween; }
    public Integer getFolhaPagamentoId() { return folhaPagamentoId; }
    public void setFolhaPagamentoId(Integer folhaPagamentoId) { this.folhaPagamentoId = folhaPagamentoId; }
}
