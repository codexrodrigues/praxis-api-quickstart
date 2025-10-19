package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.HistoricoSalarialDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.HistoricoSalarialFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.HistoricoSalarial;
import com.example.praxis.apiquickstart.hr.mapper.HistoricoSalarialMapper;
import com.example.praxis.apiquickstart.hr.service.HistoricoSalarialService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.HISTORICOS_SALARIAIS)
@ApiGroup("human-resources")
public class HistoricoSalarialController extends AbstractCrudController<HistoricoSalarial, HistoricoSalarialDTO, Integer, HistoricoSalarialFilterDTO> {

    private final HistoricoSalarialService service;
    private final HistoricoSalarialMapper mapper;

    @Autowired
    public HistoricoSalarialController(HistoricoSalarialService service, HistoricoSalarialMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<HistoricoSalarial, HistoricoSalarialDTO, Integer, HistoricoSalarialFilterDTO> getService() { return service; }

    @Override
    protected HistoricoSalarialDTO toDto(HistoricoSalarial entity) { return mapper.toDto(entity); }

    @Override
    protected HistoricoSalarial toEntity(HistoricoSalarialDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(HistoricoSalarial entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(HistoricoSalarialDTO dto) { return dto.getId(); }
}

