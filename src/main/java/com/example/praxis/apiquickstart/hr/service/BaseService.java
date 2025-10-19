package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.BaseDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.BaseFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Base;
import com.example.praxis.apiquickstart.hr.mapper.BaseMapper;
import com.example.praxis.apiquickstart.hr.repository.BaseRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class BaseService extends AbstractBaseCrudService<Base, BaseDTO, Integer, BaseFilterDTO> {

    private final BaseMapper mapper;

    public BaseService(BaseRepository repository, BaseMapper mapper) {
        super(repository, Base.class);
        this.mapper = mapper;
    }

    @Override
    public Base mergeUpdate(Base existing, Base fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }
}

