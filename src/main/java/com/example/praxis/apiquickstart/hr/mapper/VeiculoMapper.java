package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.VeiculoDTO;
import com.example.praxis.apiquickstart.hr.entity.Funcionario;
import com.example.praxis.apiquickstart.hr.entity.Veiculo;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface VeiculoMapper {

    @Mappings({
            @Mapping(target = "proprietarioId", source = "proprietario.id")
    })
    VeiculoDTO toDto(Veiculo entity);

    @Mappings({
            @Mapping(target = "proprietario", expression = "java(funcionarioFromId(dto.getProprietarioId()))")
    })
    Veiculo toEntity(VeiculoDTO dto);

    void updateEntity(Veiculo source, @MappingTarget Veiculo target);

    default Funcionario funcionarioFromId(Integer id) {
        if (id == null) return null;
        Funcionario f = new Funcionario();
        f.setId(id);
        return f;
    }
}

