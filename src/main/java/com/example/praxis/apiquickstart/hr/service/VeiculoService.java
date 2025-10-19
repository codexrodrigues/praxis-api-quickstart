package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.VeiculoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VeiculoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Veiculo;
import com.example.praxis.apiquickstart.hr.mapper.VeiculoMapper;
import com.example.praxis.apiquickstart.hr.repository.VeiculoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService extends AbstractBaseCrudService<Veiculo, VeiculoDTO, Integer, VeiculoFilterDTO> {

    private final VeiculoMapper mapper;

    public VeiculoService(VeiculoRepository repository, VeiculoMapper mapper) {
        super(repository, Veiculo.class);
        this.mapper = mapper;
    }

    @Override
    public Veiculo mergeUpdate(Veiculo existing, Veiculo fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

