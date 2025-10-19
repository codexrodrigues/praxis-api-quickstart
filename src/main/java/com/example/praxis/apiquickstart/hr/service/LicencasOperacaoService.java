package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.LicencasOperacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.LicencasOperacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.LicencasOperacao;
import com.example.praxis.apiquickstart.hr.mapper.LicencasOperacaoMapper;
import com.example.praxis.apiquickstart.hr.repository.LicencasOperacaoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class LicencasOperacaoService extends AbstractBaseCrudService<LicencasOperacao, LicencasOperacaoDTO, Integer, LicencasOperacaoFilterDTO> {

    private final LicencasOperacaoMapper mapper;

    public LicencasOperacaoService(LicencasOperacaoRepository repository, LicencasOperacaoMapper mapper) {
        super(repository, LicencasOperacao.class);
        this.mapper = mapper;
    }

    @Override
    public LicencasOperacao mergeUpdate(LicencasOperacao existing, LicencasOperacao fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

