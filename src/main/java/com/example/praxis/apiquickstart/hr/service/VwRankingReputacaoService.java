package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.VwRankingReputacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwRankingReputacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwRankingReputacao;
import com.example.praxis.apiquickstart.hr.mapper.VwRankingReputacaoMapper;
import com.example.praxis.apiquickstart.hr.repository.VwRankingReputacaoRepository;
import org.praxisplatform.uischema.service.base.AbstractReadOnlyService;
import org.springframework.stereotype.Service;

@Service
public class VwRankingReputacaoService extends AbstractReadOnlyService<VwRankingReputacao, VwRankingReputacaoDTO, Integer, VwRankingReputacaoFilterDTO> {

    private final VwRankingReputacaoMapper mapper;

    public VwRankingReputacaoService(VwRankingReputacaoRepository repository, VwRankingReputacaoMapper mapper) {
        super(repository, VwRankingReputacao.class);
        this.mapper = mapper;
    }

    @Override
    public VwRankingReputacao mergeUpdate(VwRankingReputacao existing, VwRankingReputacao fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

