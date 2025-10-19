package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.EquipeMembroDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipeMembroFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.EquipeMembro;
import com.example.praxis.apiquickstart.hr.mapper.EquipeMembroMapper;
import com.example.praxis.apiquickstart.hr.service.EquipeMembroService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.EQUIPE_MEMBROS)
@ApiGroup("human-resources")
public class EquipeMembroController extends AbstractCrudController<EquipeMembro, EquipeMembroDTO, Integer, EquipeMembroFilterDTO> {

    private final EquipeMembroService service;
    private final EquipeMembroMapper mapper;

    @Autowired
    public EquipeMembroController(EquipeMembroService service, EquipeMembroMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<EquipeMembro, EquipeMembroDTO, Integer, EquipeMembroFilterDTO> getService() { return service; }

    @Override
    protected EquipeMembroDTO toDto(EquipeMembro entity) { return mapper.toDto(entity); }

    @Override
    protected EquipeMembro toEntity(EquipeMembroDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(EquipeMembro entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(EquipeMembroDTO dto) { return dto.getId(); }
}
