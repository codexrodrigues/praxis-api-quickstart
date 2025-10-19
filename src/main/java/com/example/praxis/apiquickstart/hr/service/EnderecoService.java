package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.EnderecoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EnderecoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Endereco;
import com.example.praxis.apiquickstart.hr.mapper.EnderecoMapper;
import com.example.praxis.apiquickstart.hr.repository.EnderecoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService extends AbstractBaseCrudService<Endereco, EnderecoDTO, Integer, EnderecoFilterDTO> {

    private final EnderecoMapper mapper;

    public EnderecoService(EnderecoRepository repository, EnderecoMapper mapper) {
        super(repository, Endereco.class);
        this.mapper = mapper;
    }

    @Override
    public Endereco mergeUpdate(Endereco existing, Endereco fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
