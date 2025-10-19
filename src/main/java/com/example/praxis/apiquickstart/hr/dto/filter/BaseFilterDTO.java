package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.hr.enums.BaseSigilo;
import com.example.praxis.apiquickstart.hr.enums.BaseTipo;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

public class BaseFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private BaseTipo tipo;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private BaseSigilo sigilo;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String planeta;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public BaseTipo getTipo() { return tipo; }
    public void setTipo(BaseTipo tipo) { this.tipo = tipo; }
    public BaseSigilo getSigilo() { return sigilo; }
    public void setSigilo(BaseSigilo sigilo) { this.sigilo = sigilo; }
    public String getPlaneta() { return planeta; }
    public void setPlaneta(String planeta) { this.planeta = planeta; }
}
