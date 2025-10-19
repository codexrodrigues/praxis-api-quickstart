package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.EquipamentoAlocacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipamentoAlocacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.EquipamentoAlocacao;
import com.example.praxis.apiquickstart.hr.mapper.EquipamentoAlocacaoMapper;
import com.example.praxis.apiquickstart.hr.service.EquipamentoAlocacaoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.EQUIPAMENTO_ALOCACOES)
@ApiGroup("human-resources")
public class EquipamentoAlocacaoController extends AbstractCrudController<EquipamentoAlocacao, EquipamentoAlocacaoDTO, Integer, EquipamentoAlocacaoFilterDTO> {

    private final EquipamentoAlocacaoService service;
    private final EquipamentoAlocacaoMapper mapper;

    @Autowired
    public EquipamentoAlocacaoController(EquipamentoAlocacaoService service, EquipamentoAlocacaoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<EquipamentoAlocacao, EquipamentoAlocacaoDTO, Integer, EquipamentoAlocacaoFilterDTO> getService() { return service; }

    @Override
    protected EquipamentoAlocacaoDTO toDto(EquipamentoAlocacao entity) { return mapper.toDto(entity); }

    @Override
    protected EquipamentoAlocacao toEntity(EquipamentoAlocacaoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(EquipamentoAlocacao entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(EquipamentoAlocacaoDTO dto) { return dto.getId(); }
}

