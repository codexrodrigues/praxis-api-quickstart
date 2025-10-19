package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.IncidenteDTO;
import com.example.praxis.apiquickstart.hr.entity.Incidente;
import com.example.praxis.apiquickstart.hr.entity.Missao;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface IncidenteMapper {

    @Mappings({
            @Mapping(target = "missaoId", source = "missao.id")
    })
    IncidenteDTO toDto(Incidente entity);

    @Mappings({
            @Mapping(target = "missao", expression = "java(missaoFromId(dto.getMissaoId()))")
    })
    Incidente toEntity(IncidenteDTO dto);

    void updateEntity(Incidente source, @MappingTarget Incidente target);

    default Missao missaoFromId(Integer id) {
        if (id == null) return null;
        Missao m = new Missao();
        m.setId(id);
        return m;
    }
}

