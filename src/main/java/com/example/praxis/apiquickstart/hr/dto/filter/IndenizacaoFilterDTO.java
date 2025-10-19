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

public class IndenizacaoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.INCIDENTES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "incidente.id")
    private Integer incidenteId;

    @UISchema(type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Boolean pago;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER,
            numericFormat = NumericFormat.CURRENCY, numericStep = "0.01")
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "valor")
    private List<BigDecimal> valorBetween;

    public Integer getIncidenteId() { return incidenteId; }
    public void setIncidenteId(Integer incidenteId) { this.incidenteId = incidenteId; }
    public Boolean getPago() { return pago; }
    public void setPago(Boolean pago) { this.pago = pago; }
    public List<BigDecimal> getValorBetween() { return valorBetween; }
    public void setValorBetween(List<BigDecimal> valorBetween) { this.valorBetween = valorBetween; }
}
