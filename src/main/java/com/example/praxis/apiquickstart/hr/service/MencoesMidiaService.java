package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.MencoesMidiaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MencoesMidiaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.MencoesMidia;
import com.example.praxis.apiquickstart.hr.mapper.MencoesMidiaMapper;
import com.example.praxis.apiquickstart.hr.repository.MencoesMidiaRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class MencoesMidiaService extends AbstractBaseCrudService<MencoesMidia, MencoesMidiaDTO, Integer, MencoesMidiaFilterDTO> {

    private final MencoesMidiaMapper mapper;

    public MencoesMidiaService(MencoesMidiaRepository repository, MencoesMidiaMapper mapper) {
        super(repository, MencoesMidia.class);
        this.mapper = mapper;
    }

    @Override
    public MencoesMidia mergeUpdate(MencoesMidia existing, MencoesMidia fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

