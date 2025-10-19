package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.IncidenteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.IncidenteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Incidente;
import com.example.praxis.apiquickstart.hr.mapper.IncidenteMapper;
import com.example.praxis.apiquickstart.hr.repository.IncidenteRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class IncidenteService extends AbstractBaseCrudService<Incidente, IncidenteDTO, Integer, IncidenteFilterDTO> {

    private final IncidenteMapper mapper;

    public IncidenteService(IncidenteRepository repository, IncidenteMapper mapper) {
        super(repository, Incidente.class);
        this.mapper = mapper;
    }

    @Override
    public Incidente mergeUpdate(Incidente existing, Incidente fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

