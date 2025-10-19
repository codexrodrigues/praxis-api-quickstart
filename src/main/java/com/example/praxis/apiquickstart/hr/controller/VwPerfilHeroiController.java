package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.VwPerfilHeroiDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwPerfilHeroiFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwPerfilHeroi;
import com.example.praxis.apiquickstart.hr.mapper.VwPerfilHeroiMapper;
import com.example.praxis.apiquickstart.hr.service.VwPerfilHeroiService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractReadOnlyController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.VW_PERFIL_HEROI)
@ApiGroup("human-resources")
public class VwPerfilHeroiController extends AbstractReadOnlyController<VwPerfilHeroi, VwPerfilHeroiDTO, Integer, VwPerfilHeroiFilterDTO> {

    private final VwPerfilHeroiService service;
    private final VwPerfilHeroiMapper mapper;

    @Autowired
    public VwPerfilHeroiController(VwPerfilHeroiService service, VwPerfilHeroiMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<VwPerfilHeroi, VwPerfilHeroiDTO, Integer, VwPerfilHeroiFilterDTO> getService() { return service; }

    @Override
    protected VwPerfilHeroiDTO toDto(VwPerfilHeroi entity) { return mapper.toDto(entity); }

    @Override
    protected VwPerfilHeroi toEntity(VwPerfilHeroiDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(VwPerfilHeroi entity) { return entity.getFuncionarioId(); }

    @Override
    protected Integer getDtoId(VwPerfilHeroiDTO dto) { return dto.getFuncionarioId(); }
}

