package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.Severidade;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class IncidenteFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String descricao;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Severidade severidade;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String local;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.MISSOES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "missao.id")
    private Integer missaoId;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "ocorridoEm")
    private List<OffsetDateTime> ocorridoEmBetween;

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Severidade getSeveridade() { return severidade; }
    public void setSeveridade(Severidade severidade) { this.severidade = severidade; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public List<OffsetDateTime> getOcorridoEmBetween() { return ocorridoEmBetween; }
    public void setOcorridoEmBetween(List<OffsetDateTime> ocorridoEmBetween) { this.ocorridoEmBetween = ocorridoEmBetween; }
}
