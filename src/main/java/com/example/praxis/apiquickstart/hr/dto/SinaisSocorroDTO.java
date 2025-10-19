package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.SinalSocorroStatus;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.OffsetDateTime;

public class SinaisSocorroDTO {
    private Integer id;

    @NotBlank
    @Size(max = 200)
    @UISchema(label = "Origem", type = FieldDataType.TEXT, required = true, maxLength = 200, group = "Principal", order = 10)
    private String origem;

    @UISchema(label = "Local", type = FieldDataType.TEXT, group = "Principal", order = 20)
    private String local;

    @Min(0)
    @UISchema(label = "Nível de Ameaça", type = FieldDataType.NUMBER, group = "Principal", order = 30)
    private Integer nivelAmeaca;

    @NotNull
    @UISchema(label = "Status", controlType = FieldControlType.SELECT, group = "Principal", order = 40)
    private SinalSocorroStatus status;

    @UISchema(label = "Aberto em", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER, group = "Datas", order = 10)
    private OffsetDateTime abertoEm;

    @UISchema(label = "Fechado em", type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_PICKER, group = "Datas", order = 20)
    private OffsetDateTime fechadoEm;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public Integer getNivelAmeaca() { return nivelAmeaca; }
    public void setNivelAmeaca(Integer nivelAmeaca) { this.nivelAmeaca = nivelAmeaca; }
    public SinalSocorroStatus getStatus() { return status; }
    public void setStatus(SinalSocorroStatus status) { this.status = status; }
    public OffsetDateTime getAbertoEm() { return abertoEm; }
    public void setAbertoEm(OffsetDateTime abertoEm) { this.abertoEm = abertoEm; }
    public OffsetDateTime getFechadoEm() { return fechadoEm; }
    public void setFechadoEm(OffsetDateTime fechadoEm) { this.fechadoEm = fechadoEm; }
}
