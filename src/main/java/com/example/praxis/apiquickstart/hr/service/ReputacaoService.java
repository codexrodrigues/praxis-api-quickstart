package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.ReputacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.ReputacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Reputacao;
import com.example.praxis.apiquickstart.hr.mapper.ReputacaoMapper;
import com.example.praxis.apiquickstart.hr.repository.ReputacaoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class ReputacaoService extends AbstractBaseCrudService<Reputacao, ReputacaoDTO, Integer, ReputacaoFilterDTO> {

    private final ReputacaoMapper mapper;

    public ReputacaoService(ReputacaoRepository repository, ReputacaoMapper mapper) {
        super(repository, Reputacao.class);
        this.mapper = mapper;
    }

    @Override
    public Reputacao mergeUpdate(Reputacao existing, Reputacao fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

