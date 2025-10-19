package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.hr.enums.SinalSocorroStatus;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class SinaisSocorroFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String origem;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String local;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "nivelAmeaca")
    private List<Integer> nivelAmeacaBetween;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private SinalSocorroStatus status;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "abertoEm")
    private List<OffsetDateTime> abertoEmBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "fechadoEm")
    private List<OffsetDateTime> fechadoEmBetween;

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public List<Integer> getNivelAmeacaBetween() { return nivelAmeacaBetween; }
    public void setNivelAmeacaBetween(List<Integer> nivelAmeacaBetween) { this.nivelAmeacaBetween = nivelAmeacaBetween; }
    public SinalSocorroStatus getStatus() { return status; }
    public void setStatus(SinalSocorroStatus status) { this.status = status; }
    public List<OffsetDateTime> getAbertoEmBetween() { return abertoEmBetween; }
    public void setAbertoEmBetween(List<OffsetDateTime> abertoEmBetween) { this.abertoEmBetween = abertoEmBetween; }
    public List<OffsetDateTime> getFechadoEmBetween() { return fechadoEmBetween; }
    public void setFechadoEmBetween(List<OffsetDateTime> fechadoEmBetween) { this.fechadoEmBetween = fechadoEmBetween; }
}
