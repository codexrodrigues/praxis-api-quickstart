package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.MissaoPrioridade;
import com.example.praxis.apiquickstart.hr.enums.MissaoStatus;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class MissaoFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String titulo;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String objetivo;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private MissaoPrioridade prioridade;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private MissaoStatus status;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String local;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.AMEACAS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "ameaca.id")
    private Integer ameacaId;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "inicioPrev")
    private List<OffsetDateTime> inicioPrevBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "fimPrev")
    private List<OffsetDateTime> fimPrevBetween;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }
    public MissaoPrioridade getPrioridade() { return prioridade; }
    public void setPrioridade(MissaoPrioridade prioridade) { this.prioridade = prioridade; }
    public MissaoStatus getStatus() { return status; }
    public void setStatus(MissaoStatus status) { this.status = status; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public Integer getAmeacaId() { return ameacaId; }
    public void setAmeacaId(Integer ameacaId) { this.ameacaId = ameacaId; }
    public List<OffsetDateTime> getInicioPrevBetween() { return inicioPrevBetween; }
    public void setInicioPrevBetween(List<OffsetDateTime> inicioPrevBetween) { this.inicioPrevBetween = inicioPrevBetween; }
    public List<OffsetDateTime> getFimPrevBetween() { return fimPrevBetween; }
    public void setFimPrevBetween(List<OffsetDateTime> fimPrevBetween) { this.fimPrevBetween = fimPrevBetween; }
}
