package com.example.praxis.apiquickstart.hr.dto.filter;

import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class VwResumoMissoeFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Integer missaoId;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String titulo;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String status;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String prioridade;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String local;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String ameaca;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "qtdHerois")
    private List<Long> qtdHeroisBetween;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "qtdEventos")
    private List<Long> qtdEventosBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "primeiraAcao")
    private List<OffsetDateTime> primeiraAcaoBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "ultimaAcao")
    private List<OffsetDateTime> ultimaAcaoBetween;

    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPrioridade() { return prioridade; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public String getAmeaca() { return ameaca; }
    public void setAmeaca(String ameaca) { this.ameaca = ameaca; }
    public List<Long> getQtdHeroisBetween() { return qtdHeroisBetween; }
    public void setQtdHeroisBetween(List<Long> qtdHeroisBetween) { this.qtdHeroisBetween = qtdHeroisBetween; }
    public List<Long> getQtdEventosBetween() { return qtdEventosBetween; }
    public void setQtdEventosBetween(List<Long> qtdEventosBetween) { this.qtdEventosBetween = qtdEventosBetween; }
    public List<OffsetDateTime> getPrimeiraAcaoBetween() { return primeiraAcaoBetween; }
    public void setPrimeiraAcaoBetween(List<OffsetDateTime> primeiraAcaoBetween) { this.primeiraAcaoBetween = primeiraAcaoBetween; }
    public List<OffsetDateTime> getUltimaAcaoBetween() { return ultimaAcaoBetween; }
    public void setUltimaAcaoBetween(List<OffsetDateTime> ultimaAcaoBetween) { this.ultimaAcaoBetween = ultimaAcaoBetween; }
}
