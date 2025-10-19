package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.SinaisSocorroDTO;
import com.example.praxis.apiquickstart.hr.entity.SinaisSocorro;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface SinaisSocorroMapper {
    SinaisSocorroDTO toDto(SinaisSocorro entity);
    SinaisSocorro toEntity(SinaisSocorroDTO dto);
    void updateEntity(SinaisSocorro source, @MappingTarget SinaisSocorro target);
}

