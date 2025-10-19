package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.EquipamentoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipamentoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Equipamento;
import com.example.praxis.apiquickstart.hr.mapper.EquipamentoMapper;
import com.example.praxis.apiquickstart.hr.repository.EquipamentoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService extends AbstractBaseCrudService<Equipamento, EquipamentoDTO, Integer, EquipamentoFilterDTO> {

    private final EquipamentoMapper mapper;

    public EquipamentoService(EquipamentoRepository repository, EquipamentoMapper mapper) {
        super(repository, Equipamento.class);
        this.mapper = mapper;
    }

    @Override
    public Equipamento mergeUpdate(Equipamento existing, Equipamento fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

