package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.VeiculoStatus;
import com.example.praxis.apiquickstart.hr.enums.VeiculoTipo;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.util.List;

public class VeiculoFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private VeiculoTipo tipo;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "proprietario.id")
    private Integer proprietarioId;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private VeiculoStatus status;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "capacidade")
    private List<Integer> capacidadeBetween;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public VeiculoTipo getTipo() { return tipo; }
    public void setTipo(VeiculoTipo tipo) { this.tipo = tipo; }
    public Integer getProprietarioId() { return proprietarioId; }
    public void setProprietarioId(Integer proprietarioId) { this.proprietarioId = proprietarioId; }
    public VeiculoStatus getStatus() { return status; }
    public void setStatus(VeiculoStatus status) { this.status = status; }
    public List<Integer> getCapacidadeBetween() { return capacidadeBetween; }
    public void setCapacidadeBetween(List<Integer> capacidadeBetween) { this.capacidadeBetween = capacidadeBetween; }
}
