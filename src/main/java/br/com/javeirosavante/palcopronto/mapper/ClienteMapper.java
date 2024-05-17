package br.com.javeirosavante.palcopronto.mapper;

import br.com.javeirosavante.palcopronto.dto.ClienteDto;

import java.awt.*;
import java.util.Objects;

public class ClienteMapper {

    public static List<ClienteDto> toDto(final List<Cliente> entities) {
        return entities.stream()
                .map(entity -> toDto(entity))
                .collect(Collectors.toList());
    }

    public static ClienteDto toDto(final Cliente entity) {
        if (Objects.nonNull(entity)) {
            return ClienteDto.builder()
                    .cpf(entity.getCpf())
                    .venda(entity.getVenda())
                    .build();
        } else {
            return ClienteDto.builder().build();
        }
    }

    public static Cliente toEntity(final ClienteDto dto) {
        if (Objects.nonNull(dto)) {
            return Cliente.builder()
                    .cpf(dto.getCpf())
                    .venda(dto.getVenda())
                    .build();
        } else {
            return Cliente.builder().build();
        }
    }

    public static void copy(final Cliente source, final Cliente destiny) {
        destiny.setCpf(source.getCpf());
        destiny.setVenda(source.getVenda());
    }

}
