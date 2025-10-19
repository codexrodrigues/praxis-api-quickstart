package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.EquipamentoDTO;
import com.example.praxis.apiquickstart.hr.entity.Equipamento;
import com.example.praxis.apiquickstart.hr.entity.Funcionario;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface EquipamentoMapper {

    @Mappings({
            @Mapping(target = "proprietarioId", source = "proprietario.id")
    })
    EquipamentoDTO toDto(Equipamento entity);

    @Mappings({
            @Mapping(target = "proprietario", expression = "java(funcionarioFromId(dto.getProprietarioId()))")
    })
    Equipamento toEntity(EquipamentoDTO dto);

    void updateEntity(Equipamento source, @MappingTarget Equipamento target);

    default Funcionario funcionarioFromId(Integer id) {
        if (id == null) return null;
        Funcionario f = new Funcionario();
        f.setId(id);
        return f;
    }
}

