package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.AcordoStatus;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class AcordosRegulatorioDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true)
    private String nome;

    @NotBlank
    @UISchema(label = "Jurisdição", required = true)
    private String jurisdicao;

    @NotNull
    @UISchema(label = "Status", controlType = FieldControlType.SELECT, required = true)
    private AcordoStatus status;

    @UISchema(label = "Descrição", controlType = FieldControlType.TEXTAREA, maxLength = 4000)
    private String descricao;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getJurisdicao() { return jurisdicao; }
    public void setJurisdicao(String jurisdicao) { this.jurisdicao = jurisdicao; }
    public AcordoStatus getStatus() { return status; }
    public void setStatus(AcordoStatus status) { this.status = status; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
