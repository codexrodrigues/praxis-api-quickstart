package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.VeiculoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VeiculoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Veiculo;
import com.example.praxis.apiquickstart.hr.mapper.VeiculoMapper;
import com.example.praxis.apiquickstart.hr.service.VeiculoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.VEICULOS)
@ApiGroup("human-resources")
public class VeiculoController extends AbstractCrudController<Veiculo, VeiculoDTO, Integer, VeiculoFilterDTO> {

    private final VeiculoService service;
    private final VeiculoMapper mapper;

    @Autowired
    public VeiculoController(VeiculoService service, VeiculoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Veiculo, VeiculoDTO, Integer, VeiculoFilterDTO> getService() { return service; }

    @Override
    protected VeiculoDTO toDto(Veiculo entity) { return mapper.toDto(entity); }

    @Override
    protected Veiculo toEntity(VeiculoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Veiculo entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(VeiculoDTO dto) { return dto.getId(); }
}

