package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.AcordosRegulatorioDTO;
import com.example.praxis.apiquickstart.hr.entity.AcordosRegulatorio;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface AcordosRegulatorioMapper {
    AcordosRegulatorioDTO toDto(AcordosRegulatorio entity);
    AcordosRegulatorio toEntity(AcordosRegulatorioDTO dto);
    void updateEntity(AcordosRegulatorio source, @MappingTarget AcordosRegulatorio target);
}

