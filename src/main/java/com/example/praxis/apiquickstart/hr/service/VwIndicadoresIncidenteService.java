package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.VwIndicadoresIncidenteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwIndicadoresIncidenteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwIndicadoresIncidente;
import com.example.praxis.apiquickstart.hr.mapper.VwIndicadoresIncidenteMapper;
import com.example.praxis.apiquickstart.hr.repository.VwIndicadoresIncidenteRepository;
import org.praxisplatform.uischema.service.base.AbstractReadOnlyService;
import org.springframework.stereotype.Service;

@Service
public class VwIndicadoresIncidenteService extends AbstractReadOnlyService<VwIndicadoresIncidente, VwIndicadoresIncidenteDTO, Integer, VwIndicadoresIncidenteFilterDTO> {

    private final VwIndicadoresIncidenteMapper mapper;

    public VwIndicadoresIncidenteService(VwIndicadoresIncidenteRepository repository, VwIndicadoresIncidenteMapper mapper) {
        super(repository, VwIndicadoresIncidente.class);
        this.mapper = mapper;
    }

    @Override
    public VwIndicadoresIncidente mergeUpdate(VwIndicadoresIncidente existing, VwIndicadoresIncidente fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

