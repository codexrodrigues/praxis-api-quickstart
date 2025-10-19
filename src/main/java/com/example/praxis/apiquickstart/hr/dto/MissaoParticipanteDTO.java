package com.example.praxis.apiquickstart.hr.dto;

import com.example.praxis.apiquickstart.hr.enums.PapelMissao;
import com.example.praxis.apiquickstart.hr.enums.ResultadoMissao;
import jakarta.validation.constraints.*;
import org.praxisplatform.uischema.FieldControlType;
import org.praxisplatform.uischema.extension.annotation.UISchema;

public class MissaoParticipanteDTO {
    private Integer id;

    @NotNull
    @UISchema(label = "Missão", controlType = FieldControlType.SELECT, required = true,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.MISSOES + "/options/filter")
    private Integer missaoId;

    @NotNull
    @UISchema(label = "Funcionário", controlType = FieldControlType.SELECT, required = true,
            valueField = "id", displayField = "label",
            endpoint = com.example.praxis.apiquickstart.constants.ApiPaths.HumanResources.FUNCIONARIOS + "/options/filter")
    private Integer funcionarioId;

    @UISchema(label = "Papel", controlType = FieldControlType.SELECT)
    private PapelMissao papel;

    @UISchema(label = "Resultado", controlType = FieldControlType.SELECT)
    private ResultadoMissao resultado;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getMissaoId() { return missaoId; }
    public void setMissaoId(Integer missaoId) { this.missaoId = missaoId; }
    public Integer getFuncionarioId() { return funcionarioId; }
    public void setFuncionarioId(Integer funcionarioId) { this.funcionarioId = funcionarioId; }
    public PapelMissao getPapel() { return papel; }
    public void setPapel(PapelMissao papel) { this.papel = papel; }
    public ResultadoMissao getResultado() { return resultado; }
    public void setResultado(ResultadoMissao resultado) { this.resultado = resultado; }
}
