package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.BaseDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.BaseFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Base;
import com.example.praxis.apiquickstart.hr.mapper.BaseMapper;
import com.example.praxis.apiquickstart.hr.service.BaseService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.BASES)
@ApiGroup("human-resources")
public class BaseController extends AbstractCrudController<Base, BaseDTO, Integer, BaseFilterDTO> {

    private final BaseService service;
    private final BaseMapper mapper;

    @Autowired
    public BaseController(BaseService service, BaseMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Base, BaseDTO, Integer, BaseFilterDTO> getService() { return service; }

    @Override
    protected BaseDTO toDto(Base entity) { return mapper.toDto(entity); }

    @Override
    protected Base toEntity(BaseDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Base entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(BaseDTO dto) { return dto.getId(); }
}

