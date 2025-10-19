package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.EquipeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Equipe;
import com.example.praxis.apiquickstart.hr.mapper.EquipeMapper;
import com.example.praxis.apiquickstart.hr.repository.EquipeRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class EquipeService extends AbstractBaseCrudService<Equipe, EquipeDTO, Integer, EquipeFilterDTO> {

    private final EquipeMapper mapper;

    public EquipeService(EquipeRepository repository, EquipeMapper mapper) {
        super(repository, Equipe.class);
        this.mapper = mapper;
    }

    @Override
    public Equipe mergeUpdate(Equipe existing, Equipe fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

