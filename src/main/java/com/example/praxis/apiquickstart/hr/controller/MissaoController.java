package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.MissaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MissaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Missao;
import com.example.praxis.apiquickstart.hr.mapper.MissaoMapper;
import com.example.praxis.apiquickstart.hr.service.MissaoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.MISSOES)
@ApiGroup("human-resources")
public class MissaoController extends AbstractCrudController<Missao, MissaoDTO, Integer, MissaoFilterDTO> {

    private final MissaoService service;
    private final MissaoMapper mapper;

    @Autowired
    public MissaoController(MissaoService service, MissaoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Missao, MissaoDTO, Integer, MissaoFilterDTO> getService() { return service; }

    @Override
    protected MissaoDTO toDto(Missao entity) { return mapper.toDto(entity); }

    @Override
    protected Missao toEntity(MissaoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Missao entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(MissaoDTO dto) { return dto.getId(); }
}

