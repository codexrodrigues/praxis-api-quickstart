package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.DepartamentoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.DepartamentoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Departamento;
import com.example.praxis.apiquickstart.hr.mapper.DepartamentoMapper;
import com.example.praxis.apiquickstart.hr.service.DepartamentoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.DEPARTAMENTOS)
@ApiGroup("human-resources")
public class DepartamentoController extends AbstractCrudController<Departamento, DepartamentoDTO, Integer, DepartamentoFilterDTO> {

    private final DepartamentoService service;
    private final DepartamentoMapper mapper;

    @Autowired
    public DepartamentoController(DepartamentoService service, DepartamentoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Departamento, DepartamentoDTO, Integer, DepartamentoFilterDTO> getService() {
        return service;
    }

    @Override
    protected DepartamentoDTO toDto(Departamento entity) { return mapper.toDto(entity); }

    @Override
    protected Departamento toEntity(DepartamentoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Departamento entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(DepartamentoDTO dto) { return dto.getId(); }
}
