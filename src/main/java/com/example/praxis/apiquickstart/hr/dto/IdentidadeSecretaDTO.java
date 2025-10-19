package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class IdentidadeSecretaDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter", required = true)
    private Integer funcionarioId;

    @NotBlank
    @UISchema(label = "Codinome", required = true)
    private String codinome;

    @NotBlank
    @UISchema(label = "Universo", required = true)
    private String universo;

    @NotNull
    @UISchema(label = "Exposição Pública")
    private Boolean exposicaoPublica;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getCodinome() { return codinome; }
    public void setCodinome(String codinome) { this.codinome = codinome; }
    public String getUniverso() { return universo; }
    public void setUniverso(String universo) { this.universo = universo; }
    public Boolean getExposicaoPublica() { return exposicaoPublica; }
    public void setExposicaoPublica(Boolean exposicaoPublica) { this.exposicaoPublica = exposicaoPublica; }
}
