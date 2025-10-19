package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.VwPerfilHeroiDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.VwPerfilHeroiFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.VwPerfilHeroi;
import com.example.praxis.apiquickstart.hr.mapper.VwPerfilHeroiMapper;
import com.example.praxis.apiquickstart.hr.repository.VwPerfilHeroiRepository;
import org.praxisplatform.uischema.service.base.AbstractReadOnlyService;
import org.springframework.stereotype.Service;

@Service
public class VwPerfilHeroiService extends AbstractReadOnlyService<VwPerfilHeroi, VwPerfilHeroiDTO, Integer, VwPerfilHeroiFilterDTO> {

    private final VwPerfilHeroiMapper mapper;

    public VwPerfilHeroiService(VwPerfilHeroiRepository repository, VwPerfilHeroiMapper mapper) {
        super(repository, VwPerfilHeroi.class);
        this.mapper = mapper;
    }

    @Override
    public VwPerfilHeroi mergeUpdate(VwPerfilHeroi existing, VwPerfilHeroi fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

