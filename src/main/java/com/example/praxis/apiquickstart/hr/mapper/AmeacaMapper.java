package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.AmeacaDTO;
import com.example.praxis.apiquickstart.hr.entity.Ameaca;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface AmeacaMapper {
    AmeacaDTO toDto(Ameaca entity);
    Ameaca toEntity(AmeacaDTO dto);
    void updateEntity(Ameaca source, @MappingTarget Ameaca target);
}

