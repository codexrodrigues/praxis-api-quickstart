package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

public class VeiculoMissaoUsoDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Veículo", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.VEICULOS + "/options/filter", required = true)
    private Integer veiculoId;

    @NotNull
    @UISchema(label = "Missão", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.MISSOES + "/options/filter", required = true)
    private Integer missaoId;

    @UISchema(label = "Piloto", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer pilotoId;

    @UISchema(label = "Partida", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime partida;

    @UISchema(label = "Chegada", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime chegada;

    @UISchema(label = "Observação", controlType = FieldControlType.TEXTAREA, maxLength = 2000)
    private String observacao;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getVeiculoId() { return veiculoId; }
    public void setVeiculoId(Integer veiculoId) { this.veiculoId = veiculoId; }
    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public Integer getPilotoId() { return pilotoId; }
    public void setPilotoId(Integer pilotoId) { this.pilotoId = pilotoId; }
    public OffsetDateTime getPartida() { return partida; }
    public void setPartida(OffsetDateTime partida) { this.partida = partida; }
    public OffsetDateTime getChegada() { return chegada; }
    public void setChegada(OffsetDateTime chegada) { this.chegada = chegada; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}
