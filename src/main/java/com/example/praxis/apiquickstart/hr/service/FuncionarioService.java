package com.example.praxis.apiquickstart.hr.service;

import com.example.praxis.apiquickstart.hr.dto.FuncionarioDTO;
import com.example.praxis.apiquickstart.hr.dto.filter.FuncionarioFilterDTO;
import com.example.praxis.apiquickstart.hr.entity.Funcionario;
import com.example.praxis.apiquickstart.hr.mapper.FuncionarioMapper;
import com.example.praxis.apiquickstart.hr.repository.FuncionarioRepository;
import org.praxisplatform.uischema.service.base.AbstractBaseCrudService;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService extends AbstractBaseCrudService<Funcionario, FuncionarioDTO, Integer, FuncionarioFilterDTO> {

    private final FuncionarioMapper mapper;

    public FuncionarioService(FuncionarioRepository repository, FuncionarioMapper mapper) {
        super(repository, Funcionario.class);
        this.mapper = mapper;
    }

    @Override
    public Funcionario mergeUpdate(Funcionario existing, Funcionario fromPayload) {
        mapper.updateEntity(fromPayload, existing);
        return existing;
    }

    @Override
    public java.util.Optional<String> getDatasetVersion() {
        long count = getRepository().count();
        return java.util.Optional.of(getEntityClass().getSimpleName() + ":" + count);
    }
}
