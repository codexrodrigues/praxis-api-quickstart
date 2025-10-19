package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.MissaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MissaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Missao;
import com.example.praxis.apiquickstart.hr.mapper.MissaoMapper;
import com.example.praxis.apiquickstart.hr.repository.MissaoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class MissaoService extends AbstractBaseCrudService<Missao, MissaoDTO, Integer, MissaoFilterDTO> {

    private final MissaoMapper mapper;

    public MissaoService(MissaoRepository repository, MissaoMapper mapper) {
        super(repository, Missao.class);
        this.mapper = mapper;
    }

    @Override
    public Missao mergeUpdate(Missao existing, Missao fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

