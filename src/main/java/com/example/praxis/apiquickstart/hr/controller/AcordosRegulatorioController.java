package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.AcordosRegulatorioDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.AcordosRegulatorioFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.AcordosRegulatorio;
import com.example.praxis.apiquickstart.hr.mapper.AcordosRegulatorioMapper;
import com.example.praxis.apiquickstart.hr.service.AcordosRegulatorioService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.ACORDOS_REGULATORIOS)
@ApiGroup("human-resources")
public class AcordosRegulatorioController extends AbstractCrudController<AcordosRegulatorio, AcordosRegulatorioDTO, Integer, AcordosRegulatorioFilterDTO> {

    private final AcordosRegulatorioService service;
    private final AcordosRegulatorioMapper mapper;

    @Autowired
    public AcordosRegulatorioController(AcordosRegulatorioService service, AcordosRegulatorioMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<AcordosRegulatorio, AcordosRegulatorioDTO, Integer, AcordosRegulatorioFilterDTO> getService() { return service; }

    @Override
    protected AcordosRegulatorioDTO toDto(AcordosRegulatorio entity) { return mapper.toDto(entity); }

    @Override
    protected AcordosRegulatorio toEntity(AcordosRegulatorioDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(AcordosRegulatorio entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(AcordosRegulatorioDTO dto) { return dto.getId(); }
}

