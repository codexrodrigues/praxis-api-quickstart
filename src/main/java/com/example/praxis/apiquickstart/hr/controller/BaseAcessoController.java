package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.BaseAcessoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.BaseAcessoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.BaseAcesso;
import com.example.praxis.apiquickstart.hr.mapper.BaseAcessoMapper;
import com.example.praxis.apiquickstart.hr.service.BaseAcessoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.BASE_ACESSOS)
@ApiGroup("human-resources")
public class BaseAcessoController extends AbstractCrudController<BaseAcesso, BaseAcessoDTO, Integer, BaseAcessoFilterDTO> {

    private final BaseAcessoService service;
    private final BaseAcessoMapper mapper;

    @Autowired
    public BaseAcessoController(BaseAcessoService service, BaseAcessoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<BaseAcesso, BaseAcessoDTO, Integer, BaseAcessoFilterDTO> getService() { return service; }

    @Override
    protected BaseAcessoDTO toDto(BaseAcesso entity) { return mapper.toDto(entity); }

    @Override
    protected BaseAcesso toEntity(BaseAcessoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(BaseAcesso entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(BaseAcessoDTO dto) { return dto.getId(); }
}
