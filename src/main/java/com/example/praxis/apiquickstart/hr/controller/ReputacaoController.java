package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.ReputacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.ReputacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Reputacao;
import com.example.praxis.apiquickstart.hr.mapper.ReputacaoMapper;
import com.example.praxis.apiquickstart.hr.service.ReputacaoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.REPUTACOES)
@ApiGroup("human-resources")
public class ReputacaoController extends AbstractCrudController<Reputacao, ReputacaoDTO, Integer, ReputacaoFilterDTO> {

    private final ReputacaoService service;
    private final ReputacaoMapper mapper;

    @Autowired
    public ReputacaoController(ReputacaoService service, ReputacaoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Reputacao, ReputacaoDTO, Integer, ReputacaoFilterDTO> getService() { return service; }

    @Override
    protected ReputacaoDTO toDto(Reputacao entity) { return mapper.toDto(entity); }

    @Override
    protected Reputacao toEntity(ReputacaoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Reputacao entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(ReputacaoDTO dto) { return dto.getId(); }
}

