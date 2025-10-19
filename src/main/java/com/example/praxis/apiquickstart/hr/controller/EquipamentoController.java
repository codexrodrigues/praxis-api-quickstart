package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.EquipamentoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipamentoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Equipamento;
import com.example.praxis.apiquickstart.hr.mapper.EquipamentoMapper;
import com.example.praxis.apiquickstart.hr.service.EquipamentoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.EQUIPAMENTOS)
@ApiGroup("human-resources")
public class EquipamentoController extends AbstractCrudController<Equipamento, EquipamentoDTO, Integer, EquipamentoFilterDTO> {

    private final EquipamentoService service;
    private final EquipamentoMapper mapper;

    @Autowired
    public EquipamentoController(EquipamentoService service, EquipamentoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Equipamento, EquipamentoDTO, Integer, EquipamentoFilterDTO> getService() { return service; }

    @Override
    protected EquipamentoDTO toDto(Equipamento entity) { return mapper.toDto(entity); }

    @Override
    protected Equipamento toEntity(EquipamentoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Equipamento entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(EquipamentoDTO dto) { return dto.getId(); }
}

