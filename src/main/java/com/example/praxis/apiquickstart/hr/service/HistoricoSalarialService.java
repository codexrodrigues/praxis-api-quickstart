package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.HistoricoSalarialDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.HistoricoSalarialFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.HistoricoSalarial;
import com.example.praxis.apiquickstart.hr.mapper.HistoricoSalarialMapper;
import com.example.praxis.apiquickstart.hr.repository.HistoricoSalarialRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class HistoricoSalarialService extends AbstractBaseCrudService<HistoricoSalarial, HistoricoSalarialDTO, Integer, HistoricoSalarialFilterDTO> {

    private final HistoricoSalarialMapper mapper;

    public HistoricoSalarialService(HistoricoSalarialRepository repository, HistoricoSalarialMapper mapper) {
        super(repository, HistoricoSalarial.class);
        this.mapper = mapper;
    }

    @Override
    public HistoricoSalarial mergeUpdate(HistoricoSalarial existing, HistoricoSalarial fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

