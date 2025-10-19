package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.hr.enums.AcordoStatus;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

public class AcordosRegulatorioFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String jurisdicao;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private AcordoStatus status;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getJurisdicao() { return jurisdicao; }
    public void setJurisdicao(String jurisdicao) { this.jurisdicao = jurisdicao; }
    public AcordoStatus getStatus() { return status; }
    public void setStatus(AcordoStatus status) { this.status = status; }
}
