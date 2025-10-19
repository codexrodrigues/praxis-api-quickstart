package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.hr.enums.AmeacaClasse;
import com.example.praxis.apiquickstart.hr.enums.AmeacaStatus;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.util.List;

public class AmeacaFilterDTO implements GenericFilterDTO {
    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String nome;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private AmeacaClasse classe;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String planeta;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.RANGE_SLIDER)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "nivel")
    private List<Integer> nivelBetween;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private AmeacaStatus status;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public AmeacaClasse getClasse() { return classe; }
    public void setClasse(AmeacaClasse classe) { this.classe = classe; }
    public String getPlaneta() { return planeta; }
    public void setPlaneta(String planeta) { this.planeta = planeta; }
    public List<Integer> getNivelBetween() { return nivelBetween; }
    public void setNivelBetween(List<Integer> nivelBetween) { this.nivelBetween = nivelBetween; }
    public AmeacaStatus getStatus() { return status; }
    public void setStatus(AmeacaStatus status) { this.status = status; }
}
