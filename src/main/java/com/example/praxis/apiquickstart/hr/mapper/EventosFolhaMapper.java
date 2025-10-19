package com.example.praxis.apiquickstart.hr.mapper;

import com.example.praxis.apiquickstart.hr.dto.EventosFolhaDTO;
import com.example.praxis.apiquickstart.hr.entity.EventosFolha;
import com.example.praxis.apiquickstart.hr.entity.FolhasPagamento;
import org.mapstruct.*;
import org.praxisplatform.uischema.mapper.config.CorporateMapperConfig;

@Mapper(componentModel = "spring", config = CorporateMapperConfig.class)
public interface EventosFolhaMapper {

    @Mappings({
            @Mapping(target = "folhaPagamentoId", source = "folhaPagamento.id")
    })
    EventosFolhaDTO toDto(EventosFolha entity);

    @Mappings({
            @Mapping(target = "folhaPagamento", expression = "java(folhaFromId(dto.getFolhaPagamentoId()))")
    })
    EventosFolha toEntity(EventosFolhaDTO dto);

    void updateEntity(EventosFolha source, @MappingTarget EventosFolha target);

    default FolhasPagamento folhaFromId(Integer id) {
        if (id == null) return null;
        FolhasPagamento f = new FolhasPagamento();
        f.setId(id);
        return f;
    }
}

