package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.MencoesMidiaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MencoesMidiaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.MencoesMidia;
import com.example.praxis.apiquickstart.hr.mapper.MencoesMidiaMapper;
import com.example.praxis.apiquickstart.hr.service.MencoesMidiaService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.MENCOES_MIDIA)
@ApiGroup("human-resources")
public class MencoesMidiaController extends AbstractCrudController<MencoesMidia, MencoesMidiaDTO, Integer, MencoesMidiaFilterDTO> {

    private final MencoesMidiaService service;
    private final MencoesMidiaMapper mapper;

    @Autowired
    public MencoesMidiaController(MencoesMidiaService service, MencoesMidiaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<MencoesMidia, MencoesMidiaDTO, Integer, MencoesMidiaFilterDTO> getService() { return service; }

    @Override
    protected MencoesMidiaDTO toDto(MencoesMidia entity) { return mapper.toDto(entity); }

    @Override
    protected MencoesMidia toEntity(MencoesMidiaDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(MencoesMidia entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(MencoesMidiaDTO dto) { return dto.getId(); }
}

