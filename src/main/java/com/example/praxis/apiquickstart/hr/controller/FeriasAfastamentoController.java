package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.FeriasAfastamentoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.FeriasAfastamentoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.FeriasAfastamento;
import com.example.praxis.apiquickstart.hr.mapper.FeriasAfastamentoMapper;
import com.example.praxis.apiquickstart.hr.service.FeriasAfastamentoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.FERIAS_AFASTAMENTOS)
@ApiGroup("human-resources")
public class FeriasAfastamentoController extends AbstractCrudController<FeriasAfastamento, FeriasAfastamentoDTO, Integer, FeriasAfastamentoFilterDTO> {

    private final FeriasAfastamentoService service;
    private final FeriasAfastamentoMapper mapper;

    @Autowired
    public FeriasAfastamentoController(FeriasAfastamentoService service, FeriasAfastamentoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<FeriasAfastamento, FeriasAfastamentoDTO, Integer, FeriasAfastamentoFilterDTO> getService() { return service; }

    @Override
    protected FeriasAfastamentoDTO toDto(FeriasAfastamento entity) { return mapper.toDto(entity); }

    @Override
    protected FeriasAfastamento toEntity(FeriasAfastamentoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(FeriasAfastamento entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(FeriasAfastamentoDTO dto) { return dto.getId(); }
}
