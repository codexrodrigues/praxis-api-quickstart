package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.MissaoParticipanteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MissaoParticipanteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.MissaoParticipante;
import com.example.praxis.apiquickstart.hr.mapper.MissaoParticipanteMapper;
import com.example.praxis.apiquickstart.hr.service.MissaoParticipanteService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.MISSAO_PARTICIPANTES)
@ApiGroup("human-resources")
public class MissaoParticipanteController extends AbstractCrudController<MissaoParticipante, MissaoParticipanteDTO, Integer, MissaoParticipanteFilterDTO> {

    private final MissaoParticipanteService service;
    private final MissaoParticipanteMapper mapper;

    @Autowired
    public MissaoParticipanteController(MissaoParticipanteService service, MissaoParticipanteMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<MissaoParticipante, MissaoParticipanteDTO, Integer, MissaoParticipanteFilterDTO> getService() { return service; }

    @Override
    protected MissaoParticipanteDTO toDto(MissaoParticipante entity) { return mapper.toDto(entity); }

    @Override
    protected MissaoParticipante toEntity(MissaoParticipanteDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(MissaoParticipante entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(MissaoParticipanteDTO dto) { return dto.getId(); }
}

