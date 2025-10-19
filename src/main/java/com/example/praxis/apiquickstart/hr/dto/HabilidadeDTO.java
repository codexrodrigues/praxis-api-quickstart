package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.HabilidadeCategoria;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class HabilidadeDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true)
    private String nome;

    @UISchema(label = "Categoria", controlType = FieldControlType.SELECT)
    private HabilidadeCategoria categoria;

    @UISchema(label = "Descrição", controlType = FieldControlType.TEXTAREA, maxLength = 2000)
    private String descricao;

    @Min(0)
    @UISchema(label = "Nível de Poder", type = FieldDataType.NUMBER)
    private Integer nivelPoder;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public HabilidadeCategoria getCategoria() { return categoria; }
    public void setCategoria(HabilidadeCategoria categoria) { this.categoria = categoria; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Integer getNivelPoder() { return nivelPoder; }
    public void setNivelPoder(Integer nivelPoder) { this.nivelPoder = nivelPoder; }
}

