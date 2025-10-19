package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.LicencaNivel;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.LocalDate;

public class LicencasOperacaoDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Acordo Regulatório", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.ACORDOS_REGULATORIOS + "/options/filter", required = true)
    private Integer acordoId;

    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    @UISchema(label = "Equipe", controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.EQUIPES + "/options/filter")
    private Integer equipeId;

    @UISchema(label = "Nível", controlType = FieldControlType.SELECT)
    private LicencaNivel nivel;

    @NotNull
    @UISchema(label = "Válido De", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, required = true)
    private LocalDate validoDe;

    @UISchema(label = "Válido Até", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER)
    private LocalDate validoAte;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getAcordoId() { return acordoId; }
    public void setAcordoId(Integer acordoId) { this.acordoId = acordoId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public Integer getEquipeId() { return equipeId; }
    public void setEquipeId(Integer equipeId) { this.equipeId = equipeId; }
    public LicencaNivel getNivel() { return nivel; }
    public void setNivel(LicencaNivel nivel) { this.nivel = nivel; }
    public LocalDate getValidoDe() { return validoDe; }
    public void setValidoDe(LocalDate validoDe) { this.validoDe = validoDe; }
    public LocalDate getValidoAte() { return validoAte; }
    public void setValidoAte(LocalDate validoAte) { this.validoAte = validoAte; }
}
