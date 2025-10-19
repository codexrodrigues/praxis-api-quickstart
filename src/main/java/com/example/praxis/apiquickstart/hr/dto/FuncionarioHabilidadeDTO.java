package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class FuncionarioHabilidadeDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, required = true,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    @NotNull
    @UISchema(label = "Habilidade", controlType = FieldControlType.SELECT, required = true,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.HABILIDADES + "/options/filter")
    private Integer habilidadeId;

    @NotNull
    @Min(0)
    @Max(10)
    @UISchema(label = "Proficiência", type = FieldDataType.NUMBER, required = true)
    private Integer proficiencia;

    @UISchema(label = "Origem")
    private String origem;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public Integer getHabilidadeId() { return habilidadeId; }
    public void setHabilidadeId(Integer habilidadeId) { this.habilidadeId = habilidadeId; }
    public Integer getProficiencia() { return proficiencia; }
    public void setProficiencia(Integer proficiencia) { this.proficiencia = proficiencia; }
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
}
