package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.EventosFolhaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EventosFolhaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.EventosFolha;
import com.example.praxis.apiquickstart.hr.mapper.EventosFolhaMapper;
import com.example.praxis.apiquickstart.hr.service.EventosFolhaService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.EVENTOS_FOLHA)
@ApiGroup("human-resources")
public class EventosFolhaController extends AbstractCrudController<EventosFolha, EventosFolhaDTO, Integer, EventosFolhaFilterDTO> {

    private final EventosFolhaService service;
    private final EventosFolhaMapper mapper;

    @Autowired
    public EventosFolhaController(EventosFolhaService service, EventosFolhaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<EventosFolha, EventosFolhaDTO, Integer, EventosFolhaFilterDTO> getService() { return service; }

    @Override
    protected EventosFolhaDTO toDto(EventosFolha entity) { return mapper.toDto(entity); }

    @Override
    protected EventosFolha toEntity(EventosFolhaDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(EventosFolha entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(EventosFolhaDTO dto) { return dto.getId(); }
}
