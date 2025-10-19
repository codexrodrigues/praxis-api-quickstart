package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.EventosFolhaDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EventosFolhaFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.EventosFolha;
import com.example.praxis.apiquickstart.hr.mapper.EventosFolhaMapper;
import com.example.praxis.apiquickstart.hr.repository.EventosFolhaRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class EventosFolhaService extends AbstractBaseCrudService<EventosFolha, EventosFolhaDTO, Integer, EventosFolhaFilterDTO> {

    private final EventosFolhaMapper mapper;

    public EventosFolhaService(EventosFolhaRepository repository, EventosFolhaMapper mapper) {
        super(repository, EventosFolha.class);
        this.mapper = mapper;
    }

    @Override
    public EventosFolha mergeUpdate(EventosFolha existing, EventosFolha fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
