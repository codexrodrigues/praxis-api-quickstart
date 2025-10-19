package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.LicencasOperacaoDTO;
import com.example.praxis.apiquickstart.hr.entity.*;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface LicencasOperacaoMapper {

    @Mappings({
            @Mapping(target = "acordoId", source = "acordo.id"),
            @Mapping(target = "funcionarioId", source = "funcionario.id"),
            @Mapping(target = "equipeId", source = "equipe.id")
    })
    LicencasOperacaoDTO toDto(LicencasOperacao entity);

    @Mappings({
            @Mapping(target = "acordo", expression = "java(acordoFromId(dto.getAcordoId()))"),
            @Mapping(target = "funcionario", expression = "java(funcionarioFromId(dto.getFuncionarioId()))"),
            @Mapping(target = "equipe", expression = "java(equipeFromId(dto.getEquipeId()))")
    })
    LicencasOperacao toEntity(LicencasOperacaoDTO dto);

    void updateEntity(LicencasOperacao source, @MappingTarget LicencasOperacao target);

    default AcordosRegulatorio acordoFromId(Integer id) {
        if (id == null) return null;
        AcordosRegulatorio a = new AcordosRegulatorio();
        a.setId(id);
        return a;
    }

    default Funcionario funcionarioFromId(Integer id) {
        if (id == null) return null;
        Funcionario f = new Funcionario();
        f.setId(id);
        return f;
    }

    default Equipe equipeFromId(Integer id) {
        if (id == null) return null;
        Equipe e = new Equipe();
        e.setId(id);
        return e;
    }
}

