package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.EnderecoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EnderecoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Endereco;
import com.example.praxis.apiquickstart.hr.mapper.EnderecoMapper;
import com.example.praxis.apiquickstart.hr.service.EnderecoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.ENDERECOS)
@ApiGroup("human-resources")
public class EnderecoController extends AbstractCrudController<Endereco, EnderecoDTO, Integer, EnderecoFilterDTO> {

    private final EnderecoService service;
    private final EnderecoMapper mapper;

    @Autowired
    public EnderecoController(EnderecoService service, EnderecoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Endereco, EnderecoDTO, Integer, EnderecoFilterDTO> getService() { return service; }

    @Override
    protected EnderecoDTO toDto(Endereco entity) { return mapper.toDto(entity); }

    @Override
    protected Endereco toEntity(EnderecoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Endereco entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(EnderecoDTO dto) { return dto.getId(); }
}
