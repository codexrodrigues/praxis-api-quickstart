package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.IncidenteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.IncidenteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Incidente;
import com.example.praxis.apiquickstart.hr.mapper.IncidenteMapper;
import com.example.praxis.apiquickstart.hr.service.IncidenteService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.INCIDENTES)
@ApiGroup("human-resources")
public class IncidenteController extends AbstractCrudController<Incidente, IncidenteDTO, Integer, IncidenteFilterDTO> {

    private final IncidenteService service;
    private final IncidenteMapper mapper;

    @Autowired
    public IncidenteController(IncidenteService service, IncidenteMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Incidente, IncidenteDTO, Integer, IncidenteFilterDTO> getService() { return service; }

    @Override
    protected IncidenteDTO toDto(Incidente entity) { return mapper.toDto(entity); }

    @Override
    protected Incidente toEntity(IncidenteDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Incidente entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(IncidenteDTO dto) { return dto.getId(); }
}

