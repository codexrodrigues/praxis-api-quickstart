package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.VeiculoMissaoUsoDTO;
import com.example.praxis.apiquickstart.hr.entity.*;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface VeiculoMissaoUsoMapper {

    @Mappings({
            @Mapping(target = "veiculoId", source = "veiculo.id"),
            @Mapping(target = "missaoId", source = "missao.id"),
            @Mapping(target = "pilotoId", source = "piloto.id")
    })
    VeiculoMissaoUsoDTO toDto(VeiculoMissaoUso entity);

    @Mappings({
            @Mapping(target = "veiculo", expression = "java(veiculoFromId(dto.getVeiculoId()))"),
            @Mapping(target = "missao", expression = "java(missaoFromId(dto.getMissaoId()))"),
            @Mapping(target = "piloto", expression = "java(funcionarioFromId(dto.getPilotoId()))")
    })
    VeiculoMissaoUso toEntity(VeiculoMissaoUsoDTO dto);

    void updateEntity(VeiculoMissaoUso source, @MappingTarget VeiculoMissaoUso target);

    default Veiculo veiculoFromId(Integer id) {
        if (id == null) return null;
        Veiculo v = new Veiculo();
        v.setId(id);
        return v;
    }

    default Missao missaoFromId(Integer id) {
        if (id == null) return null;
        Missao m = new Missao();
        m.setId(id);
        return m;
    }

    default Funcionario funcionarioFromId(Integer id) {
        if (id == null) return null;
        Funcionario f = new Funcionario();
        f.setId(id);
        return f;
    }
}

