package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class BaseAcessoDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Base", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.BASES + "/options/filter")
    private Integer baseId;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 20,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    @NotBlank
    @Size(max = 255)
    @UISchema(label = "Nível de Acesso", type = FieldDataType.TEXT, required = true, maxLength = 255, group = "Principal", order = 10)
    private String nivelAcesso;

    @NotNull
    @UISchema(label = "Ativo", type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX, group = "Principal", order = 20)
    private Boolean ativo;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getBaseId() { return baseId; }
    public void setBaseId(Integer baseId) { this.baseId = baseId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(String nivelAcesso) { this.nivelAcesso = nivelAcesso; }
    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
}
