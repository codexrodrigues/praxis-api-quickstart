package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.EquipeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Equipe;
import com.example.praxis.apiquickstart.hr.mapper.EquipeMapper;
import com.example.praxis.apiquickstart.hr.service.EquipeService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.EQUIPES)
@ApiGroup("human-resources")
public class EquipeController extends AbstractCrudController<Equipe, EquipeDTO, Integer, EquipeFilterDTO> {

    private final EquipeService service;
    private final EquipeMapper mapper;

    @Autowired
    public EquipeController(EquipeService service, EquipeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Equipe, EquipeDTO, Integer, EquipeFilterDTO> getService() { return service; }

    @Override
    protected EquipeDTO toDto(Equipe entity) { return mapper.toDto(entity); }

    @Override
    protected Equipe toEntity(EquipeDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Equipe entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(EquipeDTO dto) { return dto.getId(); }
}

