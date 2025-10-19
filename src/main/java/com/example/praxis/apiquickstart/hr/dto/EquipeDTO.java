package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.EquipeStatus;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class EquipeDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true)
    private String nome;

    @Size(max = 12)
    @UISchema(label = "Sigla", maxLength = 12)
    private String sigla;

    @UISchema(label = "Base Principal", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.BASES + "/options/filter")
    private Integer basePrincipalId;

    @NotNull
    @UISchema(label = "Status", controlType = FieldControlType.SELECT, required = true)
    private EquipeStatus status;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }
    public Integer getBasePrincipalId() { return basePrincipalId; }
    public void setBasePrincipalId(Integer basePrincipalId) { this.basePrincipalId = basePrincipalId; }
    public EquipeStatus getStatus() { return status; }
    public void setStatus(EquipeStatus status) { this.status = status; }
}
