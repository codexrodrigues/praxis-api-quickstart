package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.MissaoEventoDTO;
import com.example.praxis.apiquickstart.hr.entity.Missao;
import com.example.praxis.apiquickstart.hr.entity.MissaoEvento;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface MissaoEventoMapper {

    @Mappings({
            @Mapping(target = "missaoId", source = "missao.id")
    })
    MissaoEventoDTO toDto(MissaoEvento entity);

    @Mappings({
            @Mapping(target = "missao", expression = "java(missaoFromId(dto.getMissaoId()))")
    })
    MissaoEvento toEntity(MissaoEventoDTO dto);

    void updateEntity(MissaoEvento source, @MappingTarget MissaoEvento target);

    default Missao missaoFromId(Integer id) {
        if (id == null) return null;
        Missao m = new Missao();
        m.setId(id);
        return m;
    }
}

