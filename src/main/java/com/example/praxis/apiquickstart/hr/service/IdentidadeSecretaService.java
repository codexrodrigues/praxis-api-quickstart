package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.IdentidadeSecretaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.IdentidadeSecretaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.IdentidadeSecreta;
import com.example.praxis.apiquickstart.hr.mapper.IdentidadeSecretaMapper;
import com.example.praxis.apiquickstart.hr.repository.IdentidadeSecretaRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class IdentidadeSecretaService extends AbstractBaseCrudService<IdentidadeSecreta, IdentidadeSecretaDTO, Integer, IdentidadeSecretaFilterDTO> {

    private final IdentidadeSecretaMapper mapper;

    public IdentidadeSecretaService(IdentidadeSecretaRepository repository, IdentidadeSecretaMapper mapper) {
        super(repository, IdentidadeSecreta.class);
        this.mapper = mapper;
    }

    @Override
    public IdentidadeSecreta mergeUpdate(IdentidadeSecreta existing, IdentidadeSecreta fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

