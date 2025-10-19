package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.SinaisSocorroDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.SinaisSocorroFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.SinaisSocorro;
import com.example.praxis.apiquickstart.hr.mapper.SinaisSocorroMapper;
import com.example.praxis.apiquickstart.hr.service.SinaisSocorroService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.SINAIS_SOCORRO)
@ApiGroup("human-resources")
public class SinaisSocorroController extends AbstractCrudController<SinaisSocorro, SinaisSocorroDTO, Integer, SinaisSocorroFilterDTO> {

    private final SinaisSocorroService service;
    private final SinaisSocorroMapper mapper;

    @Autowired
    public SinaisSocorroController(SinaisSocorroService service, SinaisSocorroMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<SinaisSocorro, SinaisSocorroDTO, Integer, SinaisSocorroFilterDTO> getService() { return service; }

    @Override
    protected SinaisSocorroDTO toDto(SinaisSocorro entity) { return mapper.toDto(entity); }

    @Override
    protected SinaisSocorro toEntity(SinaisSocorroDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(SinaisSocorro entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(SinaisSocorroDTO dto) { return dto.getId(); }
}
