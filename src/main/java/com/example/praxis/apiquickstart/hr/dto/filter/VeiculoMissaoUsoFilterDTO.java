package com.example.praxis.apiquickstart.hr.dto.filter;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.FieldDataType;
import org.praxisplatform.uischema.extension.annotation.UISchema;
import org.praxisplatform.uischema.filter.annotation.Filterable;
import org.praxisplatform.uischema.filter.dto.GenericFilterDTO;

import java.time.OffsetDateTime;
import java.util.List;

public class VeiculoMissaoUsoFilterDTO implements GenericFilterDTO {
    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.VEICULOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "veiculo.id")
    private Integer veiculoId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.MISSOES + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "missao.id")
    private Integer missaoId;

    @UISchema(type = FieldDataType.NUMBER, controlType = FieldControlType.SELECT,
            valueField = "id", displayField = "label",
            endpoint = ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    @Filterable(operation = Filterable.FilterOperation.EQUAL, relation = "piloto.id")
    private Integer pilotoId;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "partida")
    private List<OffsetDateTime> partidaBetween;

    @UISchema(type = FieldDataType.DATE, controlType = FieldControlType.DATE_TIME_RANGE)
    @Filterable(operation = Filterable.FilterOperation.BETWEEN, relation = "chegada")
    private List<OffsetDateTime> chegadaBetween;

    public Integer getVeiculoId() { return veiculoId; }
    public void setVeiculoId(Integer veiculoId) { this.veiculoId = veiculoId; }
    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public Integer getPilotoId() { return pilotoId; }
    public void setPilotoId(Integer pilotoId) { this.pilotoId = pilotoId; }
    public List<OffsetDateTime> getPartidaBetween() { return partidaBetween; }
    public void setPartidaBetween(List<OffsetDateTime> partidaBetween) { this.partidaBetween = partidaBetween; }
    public List<OffsetDateTime> getChegadaBetween() { return chegadaBetween; }
    public void setChegadaBetween(List<OffsetDateTime> chegadaBetween) { this.chegadaBetween = chegadaBetween; }
}
