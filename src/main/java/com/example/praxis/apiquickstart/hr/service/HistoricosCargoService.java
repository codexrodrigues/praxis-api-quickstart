package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.HistoricosCargoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.HistoricosCargoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.HistoricosCargo;
import com.example.praxis.apiquickstart.hr.mapper.HistoricosCargoMapper;
import com.example.praxis.apiquickstart.hr.repository.HistoricosCargoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class HistoricosCargoService extends AbstractBaseCrudService<HistoricosCargo, HistoricosCargoDTO, Integer, HistoricosCargoFilterDTO> {

    private final HistoricosCargoMapper mapper;

    public HistoricosCargoService(HistoricosCargoRepository repository, HistoricosCargoMapper mapper) {
        super(repository, HistoricosCargo.class);
        this.mapper = mapper;
    }

    @Override
    public HistoricosCargo mergeUpdate(HistoricosCargo existing, HistoricosCargo fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

