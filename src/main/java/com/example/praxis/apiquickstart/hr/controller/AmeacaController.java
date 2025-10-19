package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.AmeacaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.AmeacaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Ameaca;
import com.example.praxis.apiquickstart.hr.mapper.AmeacaMapper;
import com.example.praxis.apiquickstart.hr.service.AmeacaService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.AMEACAS)
@ApiGroup("human-resources")
public class AmeacaController extends AbstractCrudController<Ameaca, AmeacaDTO, Integer, AmeacaFilterDTO> {

    private final AmeacaService service;
    private final AmeacaMapper mapper;

    @Autowired
    public AmeacaController(AmeacaService service, AmeacaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Ameaca, AmeacaDTO, Integer, AmeacaFilterDTO> getService() { return service; }

    @Override
    protected AmeacaDTO toDto(Ameaca entity) { return mapper.toDto(entity); }

    @Override
    protected Ameaca toEntity(AmeacaDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Ameaca entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(AmeacaDTO dto) { return dto.getId(); }
}

