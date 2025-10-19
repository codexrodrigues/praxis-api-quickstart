package com.example.praxis.apiquickstart.hr.controller;

import com.example.praxis.apiquickstart.constants.ApiPaths;
import com.example.praxis.apiquickstart.hr.dto.CargoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.CargoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Cargo;
import com.example.praxis.apiquickstart.hr.mapper.CargoMapper;
import com.example.praxis.apiquickstart.hr.service.CargoService;
import org.praxisplatform.uischema.annotation.ApiGroup;
import org.praxisplatform.uischema.annotation.ApiResource;
import org.praxisplatform.uischema.controller.base.AbstractCrudController;
import org.praxisplatform.uischema.service.base.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResource(ApiPaths.HumanResources.CARGOS)
@ApiGroup("human-resources")
public class CargoController extends AbstractCrudController<Cargo, CargoDTO, Integer, CargoFilterDTO> {

    private final CargoService service;
    private final CargoMapper mapper;

    @Autowired
    public CargoController(CargoService service, CargoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    protected BaseCrudService<Cargo, CargoDTO, Integer, CargoFilterDTO> getService() {
        return service;
    }

    @Override
    protected CargoDTO toDto(Cargo entity) { return mapper.toDto(entity); }

    @Override
    protected Cargo toEntity(CargoDTO dto) { return mapper.toEntity(dto); }

    @Override
    protected Integer getEntityId(Cargo entity) { return entity.getId(); }

    @Override
    protected Integer getDtoId(CargoDTO dto) { return dto.getId(); }
}
