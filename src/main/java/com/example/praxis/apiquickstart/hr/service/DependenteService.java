package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.DependenteDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.DependenteFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Dependente;
import com.example.praxis.apiquickstart.hr.mapper.DependenteMapper;
import com.example.praxis.apiquickstart.hr.repository.DependenteRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class DependenteService extends AbstractBaseCrudService<Dependente, DependenteDTO, Integer, DependenteFilterDTO> {

    private final DependenteMapper mapper;

    public DependenteService(DependenteRepository repository, DependenteMapper mapper) {
        super(repository, Dependente.class);
        this.mapper = mapper;
    }

    @Override
    public Dependente mergeUpdate(Dependente existing, Dependente fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
