package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.FolhasPagamentoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.FolhasPagamentoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.FolhasPagamento;
import com.example.praxis.apiquickstart.hr.mapper.FolhasPagamentoMapper;
import com.example.praxis.apiquickstart.hr.repository.FolhasPagamentoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class FolhasPagamentoService extends AbstractBaseCrudService<FolhasPagamento, FolhasPagamentoDTO, Integer, FolhasPagamentoFilterDTO> {

    private final FolhasPagamentoMapper mapper;

    public FolhasPagamentoService(FolhasPagamentoRepository repository, FolhasPagamentoMapper mapper) {
        super(repository, FolhasPagamento.class);
        this.mapper = mapper;
    }

    @Override
    public FolhasPagamento mergeUpdate(FolhasPagamento existing, FolhasPagamento fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
