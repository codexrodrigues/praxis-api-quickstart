package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.FolhasPagamentoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.FolhasPagamentoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.FolhasPagamento;
import com.example.praxis.apiquickstart.hr.mapper.FolhasPagamentoMapper;
import com.example.praxis.apiquickstart.hr.service.FolhasPagamentoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.FOLHAS_PAGAMENTO)
@ApiGroup("human-resources")
public class FolhasPagamentoController extends AbstractCrudController<FolhasPagamento, FolhasPagamentoDTO, Integer, FolhasPagamentoFilterDTO> {

    private final FolhasPagamentoService service;
    private final FolhasPagamentoMapper mapper;

    @Autowired
    public FolhasPagamentoController(FolhasPagamentoService service, FolhasPagamentoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<FolhasPagamento, FolhasPagamentoDTO, Integer, FolhasPagamentoFilterDTO> getService() { return service; }

    @Override
    protected FolhasPagamentoDTO toDto(FolhasPagamento entity) { return mapper.toDto(entity); }

    @Override
    protected FolhasPagamento toEntity(FolhasPagamentoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(FolhasPagamento entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(FolhasPagamentoDTO dto) { return dto.getId(); }
}
