package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.AcordosRegulatorioDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.AcordosRegulatorioFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.AcordosRegulatorio;
import com.example.praxis.apiquickstart.hr.mapper.AcordosRegulatorioMapper;
import com.example.praxis.apiquickstart.hr.repository.AcordosRegulatorioRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class AcordosRegulatorioService extends AbstractBaseCrudService<AcordosRegulatorio, AcordosRegulatorioDTO, Integer, AcordosRegulatorioFilterDTO> {

    private final AcordosRegulatorioMapper mapper;

    public AcordosRegulatorioService(AcordosRegulatorioRepository repository, AcordosRegulatorioMapper mapper) {
        super(repository, AcordosRegulatorio.class);
        this.mapper = mapper;
    }

    @Override
    public AcordosRegulatorio mergeUpdate(AcordosRegulatorio existing, AcordosRegulatorio fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

