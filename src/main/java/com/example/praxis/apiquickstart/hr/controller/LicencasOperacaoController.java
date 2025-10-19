package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.LicencasOperacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.LicencasOperacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.LicencasOperacao;
import com.example.praxis.apiquickstart.hr.mapper.LicencasOperacaoMapper;
import com.example.praxis.apiquickstart.hr.service.LicencasOperacaoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.LICENCAS_OPERACAO)
@ApiGroup("human-resources")
public class LicencasOperacaoController extends AbstractCrudController<LicencasOperacao, LicencasOperacaoDTO, Integer, LicencasOperacaoFilterDTO> {

    private final LicencasOperacaoService service;
    private final LicencasOperacaoMapper mapper;

    @Autowired
    public LicencasOperacaoController(LicencasOperacaoService service, LicencasOperacaoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<LicencasOperacao, LicencasOperacaoDTO, Integer, LicencasOperacaoFilterDTO> getService() { return service; }

    @Override
    protected LicencasOperacaoDTO toDto(LicencasOperacao entity) { return mapper.toDto(entity); }

    @Override
    protected LicencasOperacao toEntity(LicencasOperacaoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(LicencasOperacao entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(LicencasOperacaoDTO dto) { return dto.getId(); }
}

