package com.example.praxis.apiquickstart.hr.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;

import java.math.BigDecimal;

public class CargoDTO {
    private Integer id;

    @NotBlank
    @Size(max = 200)
    @UISchema(label = "Nome", required = true, maxLength = 200, group = "Principal", order = 10)
    private String nome;

    @NotBlank
    @Size(max = 100)
    @UISchema(label = "Nível", required = true, maxLength = 100, group = "Principal", order = 20)
    private String nivel;

    @UISchema(label = "Descrição", controlType = FieldControlType.TEXTAREA, maxLength = 1000, group = "Principal", order = 30)
    private String descricao;

    @DecimalMin("0.00")
    @UISchema(label = "Salário Mínimo", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, group = "Remuneração", order = 10)
    private BigDecimal salarioMinimo;

    @DecimalMin("0.00")
    @UISchema(label = "Salário Máximo", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT, group = "Remuneração", order = 20)
    private BigDecimal salarioMaximo;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public BigDecimal getSalarioMinimo() { return salarioMinimo; }
    public void setSalarioMinimo(BigDecimal salarioMinimo) { this.salarioMinimo = salarioMinimo; }
    public BigDecimal getSalarioMaximo() { return salarioMaximo; }
    public void setSalarioMaximo(BigDecimal salarioMaximo) { this.salarioMaximo = salarioMaximo; }
}
