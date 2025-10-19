package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.SinaisSocorroDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.SinaisSocorroFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.SinaisSocorro;
import com.example.praxis.apiquickstart.hr.mapper.SinaisSocorroMapper;
import com.example.praxis.apiquickstart.hr.repository.SinaisSocorroRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class SinaisSocorroService extends AbstractBaseCrudService<SinaisSocorro, SinaisSocorroDTO, Integer, SinaisSocorroFilterDTO> {

    private final SinaisSocorroMapper mapper;

    public SinaisSocorroService(SinaisSocorroRepository repository, SinaisSocorroMapper mapper) {
        super(repository, SinaisSocorro.class);
        this.mapper = mapper;
    }

    @Override
    public SinaisSocorro mergeUpdate(SinaisSocorro existing, SinaisSocorro fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
