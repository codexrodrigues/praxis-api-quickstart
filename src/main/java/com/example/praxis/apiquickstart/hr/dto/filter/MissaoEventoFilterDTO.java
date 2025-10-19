package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.MissaoEventoTipo;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class MissaoEventoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.MISSOES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "missao.id")
    private Integer missaoId;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "ocorridoEm")
    private List<OffsetDateTime> ocorridoEmBetween;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private MissaoEventoTipo tipo;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String descricao;

    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public List<OffsetDateTime> getOcorridoEmBetween() { return ocorridoEmBetween; }
    public void setOcorridoEmBetween(List<OffsetDateTime> ocorridoEmBetween) { this.ocorridoEmBetween = ocorridoEmBetween; }
    public MissaoEventoTipo getTipo() { return tipo; }
    public void setTipo(MissaoEventoTipo tipo) { this.tipo = tipo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
