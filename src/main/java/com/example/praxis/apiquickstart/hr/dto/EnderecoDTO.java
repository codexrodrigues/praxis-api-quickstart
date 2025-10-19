package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class EnderecoDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Logradouro", required = true, group = "Endereço", order = 10)
    private String logradouro;

    @NotBlank
    @Size(max = 50)
    @UISchema(label = "Número", required = true, maxLength = 50, group = "Endereço", order = 20)
    private String numero;

    @UISchema(label = "Complemento", group = "Endereço", order = 30)
    private String complemento;

    @NotBlank
    @UISchema(label = "Bairro", required = true, group = "Endereço", order = 40)
    private String bairro;

    @NotBlank
    @UISchema(label = "Cidade", required = true, group = "Endereço", order = 50)
    private String cidade;

    @NotBlank
    @Size(min = 2, max = 2)
    @Pattern(regexp = "^[A-Z]{2}$", message = "UF deve conter 2 letras maiúsculas")
    @UISchema(label = "Estado", required = true, maxLength = 2, group = "Endereço", order = 60)
    private String estado;

    @NotBlank
    @Pattern(regexp = "^\\d{5}-?\\d{3}$", message = "CEP deve ser no formato 00000-000")
    @UISchema(label = "CEP", required = true, group = "Endereço", order = 70)
    private String cep;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
}
