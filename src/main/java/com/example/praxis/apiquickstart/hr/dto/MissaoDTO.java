package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.MissaoPrioridade;
import com.example.praxis.apiquickstart.hr.enums.MissaoStatus;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

public class MissaoDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Título", required = true)
    private String titulo;

    @UISchema(label = "Objetivo", controlType = FieldControlType.TEXTAREA, maxLength = 4000)
    private String objetivo;

    @NotNull
    @UISchema(label = "Prioridade", controlType = FieldControlType.SELECT, required = true)
    private MissaoPrioridade prioridade;

    @NotNull
    @UISchema(label = "Status", controlType = FieldControlType.SELECT, required = true)
    private MissaoStatus status;

    @UISchema(label = "Local")
    private String local;

    @UISchema(label = "Ameaça", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.AMEACAS + "/options/filter")
    private Integer ameacaId;

    @UISchema(label = "Início Previsto", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime inicioPrev;

    @UISchema(label = "Fim Previsto", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime fimPrev;

    @UISchema(label = "Início Real", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime inicioReal;

    @UISchema(label = "Fim Real", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime fimReal;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
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
    public OffsetDateTime getInicioPrev() { return inicioPrev; }
    public void setInicioPrev(OffsetDateTime inicioPrev) { this.inicioPrev = inicioPrev; }
    public OffsetDateTime getFimPrev() { return fimPrev; }
    public void setFimPrev(OffsetDateTime fimPrev) { this.fimPrev = fimPrev; }
    public OffsetDateTime getInicioReal() { return inicioReal; }
    public void setInicioReal(OffsetDateTime inicioReal) { this.inicioReal = inicioReal; }
    public OffsetDateTime getFimReal() { return fimReal; }
    public void setFimReal(OffsetDateTime fimReal) { this.fimReal = fimReal; }
}
