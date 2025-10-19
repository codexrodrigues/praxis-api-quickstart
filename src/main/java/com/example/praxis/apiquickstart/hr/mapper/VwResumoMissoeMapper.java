package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.VwResumoMissoeDTO;
import com.example.praxis.apiquickstart.hr.entity.VwResumoMissoe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface VwResumoMissoeMapper {
    @Mapping(target = "missaoId", source = "missaoId")
    VwResumoMissoeDTO toDto(VwResumoMissoe entity);

    VwResumoMissoe toEntity(VwResumoMissoeDTO dto);

    void updateEntity(VwResumoMissoe source, @MappingTarget VwResumoMissoe target);
}

