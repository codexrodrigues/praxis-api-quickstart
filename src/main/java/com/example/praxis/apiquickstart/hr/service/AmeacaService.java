package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.AmeacaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.AmeacaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Ameaca;
import com.example.praxis.apiquickstart.hr.mapper.AmeacaMapper;
import com.example.praxis.apiquickstart.hr.repository.AmeacaRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class AmeacaService extends AbstractBaseCrudService<Ameaca, AmeacaDTO, Integer, AmeacaFilterDTO> {

    private final AmeacaMapper mapper;

    public AmeacaService(AmeacaRepository repository, AmeacaMapper mapper) {
        super(repository, Ameaca.class);
        this.mapper = mapper;
    }

    @Override
    public Ameaca mergeUpdate(Ameaca existing, Ameaca fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

