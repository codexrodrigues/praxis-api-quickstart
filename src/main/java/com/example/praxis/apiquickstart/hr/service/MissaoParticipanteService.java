package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.MissaoParticipanteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MissaoParticipanteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.MissaoParticipante;
import com.example.praxis.apiquickstart.hr.mapper.MissaoParticipanteMapper;
import com.example.praxis.apiquickstart.hr.repository.MissaoParticipanteRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class MissaoParticipanteService extends AbstractBaseCrudService<MissaoParticipante, MissaoParticipanteDTO, Integer, MissaoParticipanteFilterDTO> {

    private final MissaoParticipanteMapper mapper;

    public MissaoParticipanteService(MissaoParticipanteRepository repository, MissaoParticipanteMapper mapper) {
        super(repository, MissaoParticipante.class);
        this.mapper = mapper;
    }

    @Override
    public MissaoParticipante mergeUpdate(MissaoParticipante existing, MissaoParticipante fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

