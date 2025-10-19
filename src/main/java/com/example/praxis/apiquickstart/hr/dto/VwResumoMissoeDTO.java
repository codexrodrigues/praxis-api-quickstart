package com.example.praxis.apiquickstart.hr.dto;

import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

@UISchema(label = "Resumo de Missões", readOnly = true)
public class VwResumoMissoeDTO {
    private Integer missaoId;

    @UISchema(label = "Título")
    private String titulo;

    @UISchema(label = "Status")
    private String status;

    @UISchema(label = "Prioridade")
    private String prioridade;

    @UISchema(label = "Local")
    private String local;

    @UISchema(label = "Ameaça")
    private String ameaca;

    @UISchema(label = "Qtd. Heróis", type = FieldDataType.NUMBER)
    private Long qtdHerois;

    @UISchema(label = "Qtd. Eventos", type = FieldDataType.NUMBER)
    private Long qtdEventos;

    @UISchema(label = "Primeira Ação", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime primeiraAcao;

    @UISchema(label = "Última Ação", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime ultimaAcao;

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
    public Long getQtdHerois() { return qtdHerois; }
    public void setQtdHerois(Long qtdHerois) { this.qtdHerois = qtdHerois; }
    public Long getQtdEventos() { return qtdEventos; }
    public void setQtdEventos(Long qtdEventos) { this.qtdEventos = qtdEventos; }
    public OffsetDateTime getPrimeiraAcao() { return primeiraAcao; }
    public void setPrimeiraAcao(OffsetDateTime primeiraAcao) { this.primeiraAcao = primeiraAcao; }
    public OffsetDateTime getUltimaAcao() { return ultimaAcao; }
    public void setUltimaAcao(OffsetDateTime ultimaAcao) { this.ultimaAcao = ultimaAcao; }
}

