package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.MissaoEventoTipo;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

public class MissaoEventoDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Missão", controlType = FieldControlType.SELECT, required = true,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.MISSOES + "/options/filter")
    private Integer missaoId;

    @NotNull
    @UISchema(label = "Ocorrido Em", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER, required = true)
    private OffsetDateTime ocorridoEm;

    @UISchema(label = "Tipo", controlType = FieldControlType.SELECT)
    private MissaoEventoTipo tipo;

    @UISchema(label = "Descrição", controlType = FieldControlType.TEXTAREA, maxLength = 4000)
    private String descricao;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public OffsetDateTime getOcorridoEm() { return ocorridoEm; }
    public void setOcorridoEm(OffsetDateTime ocorridoEm) { this.ocorridoEm = ocorridoEm; }
    public MissaoEventoTipo getTipo() { return tipo; }
    public void setTipo(MissaoEventoTipo tipo) { this.tipo = tipo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
