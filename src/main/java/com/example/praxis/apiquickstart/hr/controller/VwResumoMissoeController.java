package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.VwResumoMissoeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwResumoMissoeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwResumoMissoe;
import com.example.praxis.apiquickstart.hr.mapper.VwResumoMissoeMapper;
import com.example.praxis.apiquickstart.hr.service.VwResumoMissoeService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractReadOnlyController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.VW_RESUMO_MISSOES)
@ApiGroup("human-resources")
public class VwResumoMissoeController extends AbstractReadOnlyController<VwResumoMissoe, VwResumoMissoeDTO, Integer, VwResumoMissoeFilterDTO> {

    private final VwResumoMissoeService service;
    private final VwResumoMissoeMapper mapper;

    @Autowired
    public VwResumoMissoeController(VwResumoMissoeService service, VwResumoMissoeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<VwResumoMissoe, VwResumoMissoeDTO, Integer, VwResumoMissoeFilterDTO> getService() { return service; }

    @Override
    protected VwResumoMissoeDTO toDto(VwResumoMissoe entity) { return mapper.toDto(entity); }

    @Override
    protected VwResumoMissoe toEntity(VwResumoMissoeDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(VwResumoMissoe entity) { return entity.getMissaoId(); }

    @Override
    protected Integer getDtoId(VwResumoMissoeDTO dto) { return dto.getMissaoId(); }
}

