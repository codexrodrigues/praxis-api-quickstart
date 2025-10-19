package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.EquipamentoStatus;
import com.example.praxis.apiquickstart.hr.enums.EquipamentoTipo;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class EquipamentoDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true)
    private String nome;

    @UISchema(label = "Tipo", controlType = FieldControlType.SELECT)
    private EquipamentoTipo tipo;

    @Min(0)
    @UISchema(label = "Resistência", type = FieldDataType.NUMBER)
    private Integer resistencia;

    @UISchema(label = "Proprietário", controlType = FieldControlType.SELECT,
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS)
    private Integer proprietarioId;

    @NotNull
    @UISchema(label = "Status", controlType = FieldControlType.SELECT, required = true)
    private EquipamentoStatus status;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public EquipamentoTipo getTipo() { return tipo; }
    public void setTipo(EquipamentoTipo tipo) { this.tipo = tipo; }
    public Integer getResistencia() { return resistencia; }
    public void setResistencia(Integer resistencia) { this.resistencia = resistencia; }
    public Integer getProprietarioId() { return proprietarioId; }
    public void setProprietarioId(Integer proprietarioId) { this.proprietarioId = proprietarioId; }
    public EquipamentoStatus getStatus() { return status; }
    public void setStatus(EquipamentoStatus status) { this.status = status; }
}

