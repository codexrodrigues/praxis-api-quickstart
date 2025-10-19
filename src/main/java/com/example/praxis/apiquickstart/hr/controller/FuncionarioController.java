package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.FuncionarioDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.FuncionarioFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Funcionario;
import com.example.praxis.apiquickstart.hr.mapper.FuncionarioMapper;
import com.example.praxis.apiquickstart.hr.service.FuncionarioService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.FUNCIONARIOS)
@ApiGroup("human-resources")
public class FuncionarioController extends AbstractCrudController<Funcionario, FuncionarioDTO, Integer, FuncionarioFilterDTO> {

    private final FuncionarioService service;
    private final FuncionarioMapper mapper;

    @Autowired
    public FuncionarioController(FuncionarioService service, FuncionarioMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Funcionario, FuncionarioDTO, Integer, FuncionarioFilterDTO> getService() {
        return service;
    }

    @Override
    protected FuncionarioDTO toDto(Funcionario entity) { return mapper.toDto(entity); }

    @Override
    protected Funcionario toEntity(FuncionarioDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Funcionario entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(FuncionarioDTO dto) { return dto.getId(); }
}
