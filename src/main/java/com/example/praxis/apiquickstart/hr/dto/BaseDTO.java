package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.BaseSigilo;
import com.example.praxis.apiquickstart.hr.enums.BaseTipo;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;

public class BaseDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true)
    private String nome;

    @UISchema(label = "Tipo", controlType = FieldControlType.SELECT)
    private BaseTipo tipo;

    @UISchema(label = "Sigilo", controlType = FieldControlType.SELECT)
    private BaseSigilo sigilo;

    @UISchema(label = "Latitude", type = FieldDataType.NUMBER)
    private BigDecimal latitude;

    @UISchema(label = "Longitude", type = FieldDataType.NUMBER)
    private BigDecimal longitude;

    @UISchema(label = "Planeta")
    private String planeta;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public BaseTipo getTipo() { return tipo; }
    public void setTipo(BaseTipo tipo) { this.tipo = tipo; }
    public BaseSigilo getSigilo() { return sigilo; }
    public void setSigilo(BaseSigilo sigilo) { this.sigilo = sigilo; }
    public BigDecimal getLatitude() { return latitude; }
    public void setLatitude(BigDecimal latitude) { this.latitude = latitude; }
    public BigDecimal getLongitude() { return longitude; }
    public void setLongitude(BigDecimal longitude) { this.longitude = longitude; }
    public String getPlaneta() { return planeta; }
    public void setPlaneta(String planeta) { this.planeta = planeta; }
}

