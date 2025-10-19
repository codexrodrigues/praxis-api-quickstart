package com.example.praxis.apiquickstart.hr.dto.filter;

import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

public class CargoFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nivel;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
}
