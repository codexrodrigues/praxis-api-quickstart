package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.BaseAcessoDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.BaseAcessoFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.BaseAcesso;
import com.example.praxis.apiquickstart.hr.mapper.BaseAcessoMapper;
import com.example.praxis.apiquickstart.hr.repository.BaseAcessoRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class BaseAcessoService extends AbstractBaseCrudService<BaseAcesso, BaseAcessoDTO, Integer, BaseAcessoFilterDTO> {

    private final BaseAcessoMapper mapper;

    public BaseAcessoService(BaseAcessoRepository repository, BaseAcessoMapper mapper) {
        super(repository, BaseAcesso.class);
        this.mapper = mapper;
    }

    @Override
    public BaseAcesso mergeUpdate(BaseAcesso existing, BaseAcesso fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
