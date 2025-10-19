package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.IndenizacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.IndenizacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Indenizacao;
import com.example.praxis.apiquickstart.hr.mapper.IndenizacaoMapper;
import com.example.praxis.apiquickstart.hr.service.IndenizacaoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.INDENIZACOES)
@ApiGroup("human-resources")
public class IndenizacaoController extends AbstractCrudController<Indenizacao, IndenizacaoDTO, Integer, IndenizacaoFilterDTO> {

    private final IndenizacaoService service;
    private final IndenizacaoMapper mapper;

    @Autowired
    public IndenizacaoController(IndenizacaoService service, IndenizacaoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Indenizacao, IndenizacaoDTO, Integer, IndenizacaoFilterDTO> getService() { return service; }

    @Override
    protected IndenizacaoDTO toDto(Indenizacao entity) { return mapper.toDto(entity); }

    @Override
    protected Indenizacao toEntity(IndenizacaoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Indenizacao entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(IndenizacaoDTO dto) { return dto.getId(); }
}

