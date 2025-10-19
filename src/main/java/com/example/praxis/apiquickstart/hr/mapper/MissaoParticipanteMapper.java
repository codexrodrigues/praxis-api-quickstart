package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.MissaoParticipanteDTO;
import com.example.praxis.apiquickstart.hr.entity.Funcionario;
import com.example.praxis.apiquickstart.hr.entity.Missao;
import com.example.praxis.apiquickstart.hr.entity.MissaoParticipante;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface MissaoParticipanteMapper {

    @Mappings({
            @Mapping(target = "missaoId", source = "missao.id"),
            @Mapping(target = "funcionarioId", source = "funcionario.id")
    })
    MissaoParticipanteDTO toDto(MissaoParticipante entity);

    @Mappings({
            @Mapping(target = "missao", expression = "java(missaoFromId(dto.getMissaoId()))"),
            @Mapping(target = "funcionario", expression = "java(funcionarioFromId(dto.getFuncionarioId()))")
    })
    MissaoParticipante toEntity(MissaoParticipanteDTO dto);

    void updateEntity(MissaoParticipante source, @MappingTarget MissaoParticipante target);

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

