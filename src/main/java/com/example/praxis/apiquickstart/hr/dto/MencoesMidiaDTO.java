package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.Sentimento;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

public class MencoesMidiaDTO {
    private Integer id;

    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    @NotBlank
    @UISchema(label = "Veículo", required = true)
    private String veiculo;

    @UISchema(label = "Sentimento", controlType = FieldControlType.SELECT)
    private Sentimento sentimento;

    @UISchema(label = "URL", type = FieldDataType.URL)
    private String url;

    @UISchema(label = "Publicado Em", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER)
    private OffsetDateTime publicadoEm;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getVeiculo() { return veiculo; }
    public void setVeiculo(String veiculo) { this.veiculo = veiculo; }
    public Sentimento getSentimento() { return sentimento; }
    public void setSentimento(Sentimento sentimento) { this.sentimento = sentimento; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public OffsetDateTime getPublicadoEm() { return publicadoEm; }
    public void setPublicadoEm(OffsetDateTime publicadoEm) { this.publicadoEm = publicadoEm; }
}
