package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.DependenteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.DependenteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Dependente;
import com.example.praxis.apiquickstart.hr.mapper.DependenteMapper;
import com.example.praxis.apiquickstart.hr.service.DependenteService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.DEPENDENTES)
@ApiGroup("human-resources")
public class DependenteController extends AbstractCrudController<Dependente, DependenteDTO, Integer, DependenteFilterDTO> {

    private final DependenteService service;
    private final DependenteMapper mapper;

    @Autowired
    public DependenteController(DependenteService service, DependenteMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Dependente, DependenteDTO, Integer, DependenteFilterDTO> getService() { return service; }

    @Override
    protected DependenteDTO toDto(Dependente entity) { return mapper.toDto(entity); }

    @Override
    protected Dependente toEntity(DependenteDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Dependente entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(DependenteDTO dto) { return dto.getId(); }
}
