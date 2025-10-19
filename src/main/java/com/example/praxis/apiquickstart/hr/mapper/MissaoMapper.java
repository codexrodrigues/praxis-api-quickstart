package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.MissaoDTO;
import com.example.praxis.apiquickstart.hr.entity.Ameaca;
import com.example.praxis.apiquickstart.hr.entity.Missao;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface MissaoMapper {

    @Mappings({
            @Mapping(target = "ameacaId", source = "ameaca.id")
    })
    MissaoDTO toDto(Missao entity);

    @Mappings({
            @Mapping(target = "ameaca", expression = "java(ameacaFromId(dto.getAmeacaId()))")
    })
    Missao toEntity(MissaoDTO dto);

    void updateEntity(Missao source, @MappingTarget Missao target);

    default Ameaca ameacaFromId(Integer id) {
        if (id == null) return null;
        Ameaca a = new Ameaca();
        a.setId(id);
        return a;
    }
}

