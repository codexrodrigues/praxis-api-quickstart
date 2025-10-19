package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.IdentidadeSecretaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.IdentidadeSecretaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.IdentidadeSecreta;
import com.example.praxis.apiquickstart.hr.mapper.IdentidadeSecretaMapper;
import com.example.praxis.apiquickstart.hr.service.IdentidadeSecretaService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.IDENTIDADES_SECRETAS)
@ApiGroup("human-resources")
public class IdentidadeSecretaController extends AbstractCrudController<IdentidadeSecreta, IdentidadeSecretaDTO, Integer, IdentidadeSecretaFilterDTO> {

    private final IdentidadeSecretaService service;
    private final IdentidadeSecretaMapper mapper;

    @Autowired
    public IdentidadeSecretaController(IdentidadeSecretaService service, IdentidadeSecretaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<IdentidadeSecreta, IdentidadeSecretaDTO, Integer, IdentidadeSecretaFilterDTO> getService() { return service; }

    @Override
    protected IdentidadeSecretaDTO toDto(IdentidadeSecreta entity) { return mapper.toDto(entity); }

    @Override
    protected IdentidadeSecreta toEntity(IdentidadeSecretaDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(IdentidadeSecreta entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(IdentidadeSecretaDTO dto) { return dto.getId(); }
}

