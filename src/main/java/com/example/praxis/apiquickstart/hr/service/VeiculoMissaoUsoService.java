package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.VeiculoMissaoUsoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VeiculoMissaoUsoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VeiculoMissaoUso;
import com.example.praxis.apiquickstart.hr.mapper.VeiculoMissaoUsoMapper;
import com.example.praxis.apiquickstart.hr.repository.VeiculoMissaoUsoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class VeiculoMissaoUsoService extends AbstractBaseCrudService<VeiculoMissaoUso, VeiculoMissaoUsoDTO, Integer, VeiculoMissaoUsoFilterDTO> {

    private final VeiculoMissaoUsoMapper mapper;

    public VeiculoMissaoUsoService(VeiculoMissaoUsoRepository repository, VeiculoMissaoUsoMapper mapper) {
        super(repository, VeiculoMissaoUso.class);
        this.mapper = mapper;
    }

    @Override
    public VeiculoMissaoUso mergeUpdate(VeiculoMissaoUso existing, VeiculoMissaoUso fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

