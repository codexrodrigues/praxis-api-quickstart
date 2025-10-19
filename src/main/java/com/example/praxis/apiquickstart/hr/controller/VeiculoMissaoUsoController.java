package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.VeiculoMissaoUsoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VeiculoMissaoUsoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VeiculoMissaoUso;
import com.example.praxis.apiquickstart.hr.mapper.VeiculoMissaoUsoMapper;
import com.example.praxis.apiquickstart.hr.service.VeiculoMissaoUsoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.VEICULO_MISSAO_USOS)
@ApiGroup("human-resources")
public class VeiculoMissaoUsoController extends AbstractCrudController<VeiculoMissaoUso, VeiculoMissaoUsoDTO, Integer, VeiculoMissaoUsoFilterDTO> {

    private final VeiculoMissaoUsoService service;
    private final VeiculoMissaoUsoMapper mapper;

    @Autowired
    public VeiculoMissaoUsoController(VeiculoMissaoUsoService service, VeiculoMissaoUsoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<VeiculoMissaoUso, VeiculoMissaoUsoDTO, Integer, VeiculoMissaoUsoFilterDTO> getService() { return service; }

    @Override
    protected VeiculoMissaoUsoDTO toDto(VeiculoMissaoUso entity) { return mapper.toDto(entity); }

    @Override
    protected VeiculoMissaoUso toEntity(VeiculoMissaoUsoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(VeiculoMissaoUso entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(VeiculoMissaoUsoDTO dto) { return dto.getId(); }
}

