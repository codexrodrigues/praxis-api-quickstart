package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.EquipamentoStatus;
import com.example.praxis.apiquickstart.hr.enums.EquipamentoTipo;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.util.List;

public class EquipamentoFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private EquipamentoTipo tipo;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "proprietario.id")
    private Integer proprietarioId;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private EquipamentoStatus status;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "resistencia")
    private List<Integer> resistenciaBetween;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public EquipamentoTipo getTipo() { return tipo; }
    public void setTipo(EquipamentoTipo tipo) { this.tipo = tipo; }
    public Integer getProprietarioId() { return proprietarioId; }
    public void setProprietarioId(Integer proprietarioId) { this.proprietarioId = proprietarioId; }
    public EquipamentoStatus getStatus() { return status; }
    public void setStatus(EquipamentoStatus status) { this.status = status; }
    public List<Integer> getResistenciaBetween() { return resistenciaBetween; }
    public void setResistenciaBetween(List<Integer> resistenciaBetween) { this.resistenciaBetween = resistenciaBetween; }
}
