package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.VwResumoMissoeDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwResumoMissoeFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwResumoMissoe;
import com.example.praxis.apiquickstart.hr.mapper.VwResumoMissoeMapper;
import com.example.praxis.apiquickstart.hr.repository.VwResumoMissoeRepository;
import org.praxisplatform.uischema.service.base.AbstractReadOnlyService;
import org.springframework.stereotype.Service;

@Service
public class VwResumoMissoeService extends AbstractReadOnlyService<VwResumoMissoe, VwResumoMissoeDTO, Integer, VwResumoMissoeFilterDTO> {

    private final VwResumoMissoeMapper mapper;

    public VwResumoMissoeService(VwResumoMissoeRepository repository, VwResumoMissoeMapper mapper) {
        super(repository, VwResumoMissoe.class);
        this.mapper = mapper;
    }

    @Override
    public VwResumoMissoe mergeUpdate(VwResumoMissoe existing, VwResumoMissoe fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

