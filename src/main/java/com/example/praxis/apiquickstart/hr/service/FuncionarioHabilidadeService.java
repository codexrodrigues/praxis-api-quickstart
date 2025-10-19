package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.FuncionarioHabilidadeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.FuncionarioHabilidadeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.FuncionarioHabilidade;
import com.example.praxis.apiquickstart.hr.mapper.FuncionarioHabilidadeMapper;
import com.example.praxis.apiquickstart.hr.repository.FuncionarioHabilidadeRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioHabilidadeService extends AbstractBaseCrudService<FuncionarioHabilidade, FuncionarioHabilidadeDTO, Integer, FuncionarioHabilidadeFilterDTO> {

    private final FuncionarioHabilidadeMapper mapper;

    public FuncionarioHabilidadeService(FuncionarioHabilidadeRepository repository, FuncionarioHabilidadeMapper mapper) {
        super(repository, FuncionarioHabilidade.class);
        this.mapper = mapper;
    }

    @Override
    public FuncionarioHabilidade mergeUpdate(FuncionarioHabilidade existing, FuncionarioHabilidade fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

