package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.enums.Sentimento;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class MencoesMidiaFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "funcionario.id")
    private Integer funcionarioId;

    @UISchema
    @Filterable(operation = Filterable.FilterOperation.LIKE)
    private String veiculo;

    @UISchema(controlType = FieldControlType.SELECT)
    @Filterable(operation = Filterable.FilterOperation.EQUAL)
    private Sentimento sentimento;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "publicadoEm")
    private List<OffsetDateTime> publicadoEmBetween;

    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public String getVeiculo() { return veiculo; }
    public void setVeiculo(String veiculo) { this.veiculo = veiculo; }
    public Sentimento getSentimento() { return sentimento; }
    public void setSentimento(Sentimento sentimento) { this.sentimento = sentimento; }
    public List<OffsetDateTime> getPublicadoEmBetween() { return publicadoEmBetween; }
    public void setPublicadoEmBetween(List<OffsetDateTime> publicadoEmBetween) { this.publicadoEmBetween = publicadoEmBetween; }
}
