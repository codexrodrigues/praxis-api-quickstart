package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.FuncionarioHabilidadeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.FuncionarioHabilidadeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.FuncionarioHabilidade;
import com.example.praxis.apiquickstart.hr.mapper.FuncionarioHabilidadeMapper;
import com.example.praxis.apiquickstart.hr.service.FuncionarioHabilidadeService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.FUNCIONARIO_HABILIDADES)
@ApiGroup("human-resources")
public class FuncionarioHabilidadeController extends AbstractCrudController<FuncionarioHabilidade, FuncionarioHabilidadeDTO, Integer, FuncionarioHabilidadeFilterDTO> {

    private final FuncionarioHabilidadeService service;
    private final FuncionarioHabilidadeMapper mapper;

    @Autowired
    public FuncionarioHabilidadeController(FuncionarioHabilidadeService service, FuncionarioHabilidadeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<FuncionarioHabilidade, FuncionarioHabilidadeDTO, Integer, FuncionarioHabilidadeFilterDTO> getService() { return service; }

    @Override
    protected FuncionarioHabilidadeDTO toDto(FuncionarioHabilidade entity) { return mapper.toDto(entity); }

    @Override
    protected FuncionarioHabilidade toEntity(FuncionarioHabilidadeDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(FuncionarioHabilidade entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(FuncionarioHabilidadeDTO dto) { return dto.getId(); }
}

