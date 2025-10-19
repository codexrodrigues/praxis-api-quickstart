package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.HabilidadeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.HabilidadeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Habilidade;
import com.example.praxis.apiquickstart.hr.mapper.HabilidadeMapper;
import com.example.praxis.apiquickstart.hr.service.HabilidadeService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.HABILIDADES)
@ApiGroup("human-resources")
public class HabilidadeController extends AbstractCrudController<Habilidade, HabilidadeDTO, Integer, HabilidadeFilterDTO> {

    private final HabilidadeService service;
    private final HabilidadeMapper mapper;

    @Autowired
    public HabilidadeController(HabilidadeService service, HabilidadeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Habilidade, HabilidadeDTO, Integer, HabilidadeFilterDTO> getService() { return service; }

    @Override
    protected HabilidadeDTO toDto(Habilidade entity) { return mapper.toDto(entity); }

    @Override
    protected Habilidade toEntity(HabilidadeDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Habilidade entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(HabilidadeDTO dto) { return dto.getId(); }
}

