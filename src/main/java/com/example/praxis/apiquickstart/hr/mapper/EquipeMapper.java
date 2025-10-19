package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.EquipeDTO;
import com.example.praxis.apiquickstart.hr.entity.Base;
import com.example.praxis.apiquickstart.hr.entity.Equipe;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface EquipeMapper {

    @Mappings({
            @Mapping(target = "basePrincipalId", source = "basePrincipal.id")
    })
    EquipeDTO toDto(Equipe entity);

    @Mappings({
            @Mapping(target = "basePrincipal", expression = "java(baseFromId(dto.getBasePrincipalId()))")
    })
    Equipe toEntity(EquipeDTO dto);

    void updateEntity(Equipe source, @MappingTarget Equipe target);

    default Base baseFromId(Integer id) {
        if (id == null) return null;
        Base b = new Base();
        b.setId(id);
        return b;
    }
}

