package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.MissaoEventoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MissaoEventoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.MissaoEvento;
import com.example.praxis.apiquickstart.hr.mapper.MissaoEventoMapper;
import com.example.praxis.apiquickstart.hr.service.MissaoEventoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.MISSAO_EVENTOS)
@ApiGroup("human-resources")
public class MissaoEventoController extends AbstractCrudController<MissaoEvento, MissaoEventoDTO, Integer, MissaoEventoFilterDTO> {

    private final MissaoEventoService service;
    private final MissaoEventoMapper mapper;

    @Autowired
    public MissaoEventoController(MissaoEventoService service, MissaoEventoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<MissaoEvento, MissaoEventoDTO, Integer, MissaoEventoFilterDTO> getService() { return service; }

    @Override
    protected MissaoEventoDTO toDto(MissaoEvento entity) { return mapper.toDto(entity); }

    @Override
    protected MissaoEvento toEntity(MissaoEventoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(MissaoEvento entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(MissaoEventoDTO dto) { return dto.getId(); }
}

