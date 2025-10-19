package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.EquipeMembroDTO;
import com.example.praxis.apiquickstart.hr.entity.Equipe;
import com.example.praxis.apiquickstart.hr.entity.EquipeMembro;
import com.example.praxis.apiquickstart.hr.entity.Funcionario;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface EquipeMembroMapper {

    @Mappings({
        @Mapping(target = "equipeId", source = "equipe.id"),
        @Mapping(target = "funcionarioId", source = "funcionario.id")
    })
    EquipeMembroDTO toDto(EquipeMembro entity);

    @Mappings({
        @Mapping(target = "equipe", expression = "java(equipeFromId(dto.getEquipeId()))"),
        @Mapping(target = "funcionario", expression = "java(funcionarioFromId(dto.getFuncionarioId()))")
    })
    EquipeMembro toEntity(EquipeMembroDTO dto);

    void updateEntity(EquipeMembro source, @MappingTarget EquipeMembro target);

    default Equipe equipeFromId(Integer id) {
        if (id == null) return null;
        Equipe e = new Equipe();
        e.setId(id);
        return e;
    }

    default Funcionario funcionarioFromId(Integer id) {
        if (id == null) return null;
        Funcionario f = new Funcionario();
        f.setId(id);
        return f;
    }
}

