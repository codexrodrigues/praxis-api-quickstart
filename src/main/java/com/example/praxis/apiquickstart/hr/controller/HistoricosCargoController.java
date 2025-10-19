package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.HistoricosCargoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.HistoricosCargoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.HistoricosCargo;
import com.example.praxis.apiquickstart.hr.mapper.HistoricosCargoMapper;
import com.example.praxis.apiquickstart.hr.service.HistoricosCargoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;

@ApiResource(ApiPaths.HumanResources.HISTORICOS_CARGOS)
@ApiGroup("human-resources")
public class HistoricosCargoController extends AbstractCrudController<HistoricosCargo, HistoricosCargoDTO, Integer, HistoricosCargoFilterDTO> {

    private final HistoricosCargoService service;
    private final HistoricosCargoMapper mapper;

    @Autowired
    public HistoricosCargoController(HistoricosCargoService service, HistoricosCargoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<HistoricosCargo, HistoricosCargoDTO, Integer, HistoricosCargoFilterDTO> getService() { return service; }

    @Override
    protected HistoricosCargoDTO toDto(HistoricosCargo entity) { return mapper.toDto(entity); }

    @Override
    protected HistoricosCargo toEntity(HistoricosCargoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(HistoricosCargo entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(HistoricosCargoDTO dto) { return dto.getId(); }
}

