package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.AmeacaClasse;
import com.example.praxis.apiquickstart.hr.enums.AmeacaStatus;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.math.BigDecimal;

public class AmeacaDTO {
    private Integer id;

    @NotBlank
    @UISchema(label = "Nome", required = true)
    private String nome;

    @UISchema(label = "Classe", controlType = FieldControlType.SELECT)
    private AmeacaClasse classe;

    @UISchema(label = "Planeta")
    private String planeta;

    @Min(0)
    @UISchema(label = "Nível", type = FieldDataType.NUMBER)
    private Integer nivel;

    @NotNull
    @UISchema(label = "Status", controlType = FieldControlType.SELECT, required = true)
    private AmeacaStatus status;

    @DecimalMin("0.00")
    @UISchema(label = "Recompensa", type = FieldDataType.NUMBER, controlType = FieldControlType.CURRENCY_INPUT)
    private BigDecimal recompensa;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public AmeacaClasse getClasse() { return classe; }
    public void setClasse(AmeacaClasse classe) { this.classe = classe; }
    public String getPlaneta() { return planeta; }
    public void setPlaneta(String planeta) { this.planeta = planeta; }
    public Integer getNivel() { return nivel; }
    public void setNivel(Integer nivel) { this.nivel = nivel; }
    public AmeacaStatus getStatus() { return status; }
    public void setStatus(AmeacaStatus status) { this.status = status; }
    public BigDecimal getRecompensa() { return recompensa; }
    public void setRecompensa(BigDecimal recompensa) { this.recompensa = recompensa; }
}

