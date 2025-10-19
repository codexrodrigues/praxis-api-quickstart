package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.VeiculoStatus;
import com.example.praxis.apiquickstart.hr.enums.VeiculoTipo;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class VeiculoDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true)
    private String nome;

    @UISchema(label = "Tipo", controlType = FieldControlType.SELECT)
    private VeiculoTipo tipo;

    @Min(0)
    @UISchema(label = "Capacidade", type = FieldDataType.NUMBER)
    private Integer capacidade;

    @UISchema(label = "Proprietário", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer proprietarioId;

    @NotNull
    @UISchema(label = "Status", controlType = FieldControlType.SELECT, required = true)
    private VeiculoStatus status;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public VeiculoTipo getTipo() { return tipo; }
    public void setTipo(VeiculoTipo tipo) { this.tipo = tipo; }
    public Integer getCapacidade() { return capacidade; }
    public void setCapacidade(Integer capacidade) { this.capacidade = capacidade; }
    public Integer getProprietarioId() { return proprietarioId; }
    public void setProprietarioId(Integer proprietarioId) { this.proprietarioId = proprietarioId; }
    public VeiculoStatus getStatus() { return status; }
    public void setStatus(VeiculoStatus status) { this.status = status; }
}
