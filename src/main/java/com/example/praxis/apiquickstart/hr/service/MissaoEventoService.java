package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.MissaoEventoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.MissaoEventoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.MissaoEvento;
import com.example.praxis.apiquickstart.hr.mapper.MissaoEventoMapper;
import com.example.praxis.apiquickstart.hr.repository.MissaoEventoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class MissaoEventoService extends AbstractBaseCrudService<MissaoEvento, MissaoEventoDTO, Integer, MissaoEventoFilterDTO> {

    private final MissaoEventoMapper mapper;

    public MissaoEventoService(MissaoEventoRepository repository, MissaoEventoMapper mapper) {
        super(repository, MissaoEvento.class);
        this.mapper = mapper;
    }

    @Override
    public MissaoEvento mergeUpdate(MissaoEvento existing, MissaoEvento fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

