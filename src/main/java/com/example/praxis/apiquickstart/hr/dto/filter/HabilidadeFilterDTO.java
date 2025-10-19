package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.hr.enums.HabilidadeCategoria;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.util.List;

public class HabilidadeFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private HabilidadeCategoria categoria;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "nivelPoder")
    private List<Integer> nivelPoderBetween;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public HabilidadeCategoria getCategoria() { return categoria; }
    public void setCategoria(HabilidadeCategoria categoria) { this.categoria = categoria; }
    public List<Integer> getNivelPoderBetween() { return nivelPoderBetween; }
    public void setNivelPoderBetween(List<Integer> nivelPoderBetween) { this.nivelPoderBetween = nivelPoderBetween; }
}
