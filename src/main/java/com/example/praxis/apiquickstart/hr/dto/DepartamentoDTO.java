package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class DepartamentoDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true, group = "Principal", order = 10)
    private String nome;

    @NotBlank
    @Size(max = 20)
    @UISchema(label = "Código", required = true, maxLength = 20, group = "Principal", order = 20)
    private String codigo;

    @UISchema(label = "Responsável", controlType = org.praxisplatform.uischema.FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer responsavelId;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Integer getResponsavelId() { return responsavelId; }
    public void setResponsavelId(Integer responsavelId) { this.responsavelId = responsavelId; }
}
