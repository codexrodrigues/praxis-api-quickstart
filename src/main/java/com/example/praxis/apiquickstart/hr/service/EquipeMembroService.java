package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.EquipeMembroDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.EquipeMembroFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.EquipeMembro;
import com.example.praxis.apiquickstart.hr.mapper.EquipeMembroMapper;
import com.example.praxis.apiquickstart.hr.repository.EquipeMembroRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class EquipeMembroService extends AbstractBaseCrudService<EquipeMembro, EquipeMembroDTO, Integer, EquipeMembroFilterDTO> {

    private final EquipeMembroMapper mapper;

    public EquipeMembroService(EquipeMembroRepository repository, EquipeMembroMapper mapper) {
        super(repository, EquipeMembro.class);
        this.mapper = mapper;
    }

    @Override
    public EquipeMembro mergeUpdate(EquipeMembro existing, EquipeMembro fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
