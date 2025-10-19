package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;

import java.time.LocalDate;

public class DependenteDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome Completo", required = true, group = "Identificação", order = 10)
    private String nomeCompleto;

    @NotBlank
    @UISchema(label = "Parentesco", required = true, group = "Identificação", order = 20)
    private String parentesco;

    @NotNull
    @Past
    @UISchema(label = "Data de Nascimento", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Identificação", order = 30)
    private LocalDate dataNascimento;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getParentesco() { return parentesco; }
    public void setParentesco(String parentesco) { this.parentesco = parentesco; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
}
