package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.PapelEquipe;
import jakarta.validation.constraints.NotNull;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

import java.time.LocalDate;

public class EquipeMembroDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Equipe", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 10,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.EQUIPES + "/options/filter")
    private Integer equipeId;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, group = "Relacionamentos", order = 20,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    @UISchema(label = "Papel", controlType = FieldControlType.SELECT, group = "Principal", order = 10)
    private PapelEquipe papel;

    @NotNull
    @UISchema(label = "Data de Entrada", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Principal", order = 20)
    private LocalDate dataEntrada;

    @UISchema(label = "Data de Saída", type = FieldDataType.DATE, controlType = FieldControlType.DATE_PICKER, group = "Principal", order = 30)
    private LocalDate dataSaida;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getEquipeId() { return equipeId; }
    public void setEquipeId(Integer equipeId) { this.equipeId = equipeId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public PapelEquipe getPapel() { return papel; }
    public void setPapel(PapelEquipe papel) { this.papel = papel; }
    public LocalDate getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }
    public LocalDate getDataSaida() { return dataSaida; }
    public void setDataSaida(LocalDate dataSaida) { this.dataSaida = dataSaida; }
}
