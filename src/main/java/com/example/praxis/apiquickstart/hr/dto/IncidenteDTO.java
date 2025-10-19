package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.Severidade;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class IncidenteDTO {
    private Integer id;

    @UISchema(label = "Missão", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.MISSOES + "/options/filter")
    private Integer missaoId;

    @NotBlank
    @UISchema(label = "Descrição", required = true)
    private String descricao;

    @UISchema(label = "Severidade", controlType = FieldControlType.SELECT)
    private Severidade severidade;

    @UISchema(label = "Local")
    private String local;

    @NotNull
    @UISchema(label = "Ocorrido em", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER, required = true)
    private OffsetDateTime ocorridoEm;

    @UISchema(label = "Danos Civis", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT)
    private BigDecimal danosCivis;

    @Min(0)
    @UISchema(label = "Feridos", type = FieldDataType.NUMBER)
    private Integer feridos;

    @Min(0)
    @UISchema(label = "Mortos", type = FieldDataType.NUMBER)
    private Integer mortos;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Severidade getSeveridade() { return severidade; }
    public void setSeveridade(Severidade severidade) { this.severidade = severidade; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public OffsetDateTime getOcorridoEm() { return ocorridoEm; }
    public void setOcorridoEm(OffsetDateTime ocorridoEm) { this.ocorridoEm = ocorridoEm; }
    public BigDecimal getDanosCivis() { return danosCivis; }
    public void setDanosCivis(BigDecimal danosCivis) { this.danosCivis = danosCivis; }
    public Integer getFeridos() { return feridos; }
    public void setFeridos(Integer feridos) { this.feridos = feridos; }
    public Integer getMortos() { return mortos; }
    public void setMortos(Integer mortos) { this.mortos = mortos; }
}
