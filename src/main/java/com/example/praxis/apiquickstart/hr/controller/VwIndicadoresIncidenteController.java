package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.VwIndicadoresIncidenteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwIndicadoresIncidenteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwIndicadoresIncidente;
import com.example.praxis.apiquickstart.hr.mapper.VwIndicadoresIncidenteMapper;
import com.example.praxis.apiquickstart.hr.service.VwIndicadoresIncidenteService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractReadOnlyController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.VW_INDICADORES_INCIDENTES)
@ApiGroup("human-resources")
public class VwIndicadoresIncidenteController extends AbstractReadOnlyController<VwIndicadoresIncidente, VwIndicadoresIncidenteDTO, Integer, VwIndicadoresIncidenteFilterDTO> {

    private final VwIndicadoresIncidenteService service;
    private final VwIndicadoresIncidenteMapper mapper;

    @Autowired
    public VwIndicadoresIncidenteController(VwIndicadoresIncidenteService service, VwIndicadoresIncidenteMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<VwIndicadoresIncidente, VwIndicadoresIncidenteDTO, Integer, VwIndicadoresIncidenteFilterDTO> getService() { return service; }

    @Override
    protected VwIndicadoresIncidenteDTO toDto(VwIndicadoresIncidente entity) { return mapper.toDto(entity); }

    @Override
    protected VwIndicadoresIncidente toEntity(VwIndicadoresIncidenteDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(VwIndicadoresIncidente entity) { return entity.getIncidenteId(); }

    @Override
    protected Integer getDtoId(VwIndicadoresIncidenteDTO dto) { return dto.getIncidenteId(); }
}

