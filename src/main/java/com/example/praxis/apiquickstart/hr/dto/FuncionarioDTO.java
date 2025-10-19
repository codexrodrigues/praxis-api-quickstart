package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.EstadoCivil;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioDTO {
    private Integer id;

    @NotBlank
    @Size(max = 200)
    @UISchema(label = "Nome Completo", required = true, maxLength = 200, group = "Identificação", order = 10)
    private String nomeCompleto;

    @NotBlank
    @Size(max = 20)
    @Pattern(regexp = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$", message = "CPF inválido")
    @UISchema(label = "CPF", required = true, maxLength = 20, group = "Identificação", order = 20)
    private String cpf;

    @NotNull
    @Past
    @UISchema(label = "Data de Nascimento", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Identificação", order = 30)
    private LocalDate dataNascimento;

    @NotBlank
    @Email
    @Size(max = 200)
    @UISchema(label = "Email", type = FieldDataType.EMAIL, maxLength = 200, group = "Contato", order = 10)
    private String email;

    @NotBlank
    @Size(max = 30)
    @UISchema(label = "Telefone", maxLength = 30, group = "Contato", order = 20)
    private String telefone;

    @NotNull
    @DecimalMin("0.00")
    @UISchema(label = "Salário", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, group = "Profissional", order = 10)
    private BigDecimal salario;

    @NotNull
    @UISchema(label = "Data de Admissão", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Profissional", order = 20)
    private LocalDate dataAdmissao;

    @NotNull
    @UISchema(label = "Ativo", type = FieldDataType.BOOLEAN, controlType = FieldControlType.CHECKBOX, group = "Profissional", order = 30)
    private Boolean ativo;

    @NotNull
    @UISchema(label = "Cargo", controlType = FieldControlType.SELECT, group = "Profissional", order = 40,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.CARGOS + "/options/filter")
    private Integer cargoId;

    @NotNull
    @UISchema(label = "Departamento", controlType = FieldControlType.SELECT, group = "Profissional", order = 50,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.DEPARTAMENTOS + "/options/filter")
    private Integer departamentoId;

    @UISchema(label = "Foto (URL)", group = "Identificação", order = 40)
    private String fotoPerfilUrl;

    @UISchema(label = "Estado Civil", controlType = FieldControlType.SELECT, group = "Identificação", order = 35)
    private EstadoCivil estadoCivil;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public BigDecimal getSalario() { return salario; }
    public void setSalario(BigDecimal salario) { this.salario = salario; }
    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }
    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
    public Integer getCargoId() { return cargoId; }
    public void setCargoId(Integer cargoId) { this.cargoId = cargoId; }
    public Integer getDepartamentoId() { return departamentoId; }
    public void setDepartamentoId(Integer departamentoId) { this.departamentoId = departamentoId; }
    public String getFotoPerfilUrl() { return fotoPerfilUrl; }
    public void setFotoPerfilUrl(String fotoPerfilUrl) { this.fotoPerfilUrl = fotoPerfilUrl; }
    public EstadoCivil getEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(EstadoCivil estadoCivil) { this.estadoCivil = estadoCivil; }
}
