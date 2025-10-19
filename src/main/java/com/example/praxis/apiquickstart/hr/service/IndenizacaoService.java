package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.IndenizacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.IndenizacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Indenizacao;
import com.example.praxis.apiquickstart.hr.mapper.IndenizacaoMapper;
import com.example.praxis.apiquickstart.hr.repository.IndenizacaoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class IndenizacaoService extends AbstractBaseCrudService<Indenizacao, IndenizacaoDTO, Integer, IndenizacaoFilterDTO> {

    private final IndenizacaoMapper mapper;

    public IndenizacaoService(IndenizacaoRepository repository, IndenizacaoMapper mapper) {
        super(repository, Indenizacao.class);
        this.mapper = mapper;
    }

    @Override
    public Indenizacao mergeUpdate(Indenizacao existing, Indenizacao fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

