package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.VwRankingReputacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwRankingReputacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwRankingReputacao;
import com.example.praxis.apiquickstart.hr.mapper.VwRankingReputacaoMapper;
import com.example.praxis.apiquickstart.hr.service.VwRankingReputacaoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractReadOnlyController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.VW_RANKING_REPUTACAO)
@ApiGroup("human-resources")
public class VwRankingReputacaoController extends AbstractReadOnlyController<VwRankingReputacao, VwRankingReputacaoDTO, Integer, VwRankingReputacaoFilterDTO> {

    private final VwRankingReputacaoService service;
    private final VwRankingReputacaoMapper mapper;

    @Autowired
    public VwRankingReputacaoController(VwRankingReputacaoService service, VwRankingReputacaoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<VwRankingReputacao, VwRankingReputacaoDTO, Integer, VwRankingReputacaoFilterDTO> getService() { return service; }

    @Override
    protected VwRankingReputacaoDTO toDto(VwRankingReputacao entity) { return mapper.toDto(entity); }

    @Override
    protected VwRankingReputacao toEntity(VwRankingReputacaoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(VwRankingReputacao entity) { return entity.getFuncionarioId(); }

    @Override
    protected Integer getDtoId(VwRankingReputacaoDTO dto) { return dto.getFuncionarioId(); }
}

