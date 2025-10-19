package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.EquipamentoAlocacaoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipamentoAlocacaoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.EquipamentoAlocacao;
import com.example.praxis.apiquickstart.hr.mapper.EquipamentoAlocacaoMapper;
import com.example.praxis.apiquickstart.hr.repository.EquipamentoAlocacaoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoAlocacaoService extends AbstractBaseCrudService<EquipamentoAlocacao, EquipamentoAlocacaoDTO, Integer, EquipamentoAlocacaoFilterDTO> {

    private final EquipamentoAlocacaoMapper mapper;

    public EquipamentoAlocacaoService(EquipamentoAlocacaoRepository repository, EquipamentoAlocacaoMapper mapper) {
        super(repository, EquipamentoAlocacao.class);
        this.mapper = mapper;
    }

    @Override
    public EquipamentoAlocacao mergeUpdate(EquipamentoAlocacao existing, EquipamentoAlocacao fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

