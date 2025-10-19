package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.HabilidadeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.HabilidadeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Habilidade;
import com.example.praxis.apiquickstart.hr.mapper.HabilidadeMapper;
import com.example.praxis.apiquickstart.hr.repository.HabilidadeRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class HabilidadeService extends AbstractBaseCrudService<Habilidade, HabilidadeDTO, Integer, HabilidadeFilterDTO> {

    private final HabilidadeMapper mapper;

    public HabilidadeService(HabilidadeRepository repository, HabilidadeMapper mapper) {
        super(repository, Habilidade.class);
        this.mapper = mapper;
    }

    @Override
    public Habilidade mergeUpdate(Habilidade existing, Habilidade fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

