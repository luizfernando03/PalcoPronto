package br.com.javeirosavante.palcopronto.mapper;

import br.com.javeirosavante.palcopronto.dto.EventoDto;
import br.com.javeirosavante.palcopronto.model.Evento;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EventoMapper {

    public static List<EventoDto> toDto(final List<Evento> entities) {
        return entities.stream()
                .map(entity -> toDto(entity))
                .collect(Collectors.toList());
    }

    public static EventoDto toDto(final Evento entity) {
        if (Objects.nonNull(entity)) {
            return EventoDto.builder()
                    .idEvento(entity.getIdEvento())
                    .nomeEvento(entity.getNomeEvento())
                    .descricaoEvento(entity.getDescricaoEvento())
                    .dataHoraEvento(entity.getDataHoraEvento())
                    .build();
        } else {
            return EventoDto.builder().build();
        }
    }

    public static Evento toEntity(final EventoDto dto) {
        if (Objects.nonNull(dto)) {
            return Evento.builder()
                    .idEvento(dto.getIdEvento())
                    .nomeEvento(dto.getNomeEvento())
                    .descricaoEvento(dto.getDescricaoEvento())
                    .dataHoraEvento(dto.getDataHoraEvento())
                    .build();
        } else {
            return Evento.builder().build();
        }
    }

    public static void copy(final Evento source, final Evento destiny) {
        destiny.setIdEvento(source.getIdEvento());
        destiny.setNomeEvento(source.getNomeEvento());
        destiny.setDescricaoEvento(source.getDescricaoEvento());
        destiny.setDataHoraEvento(source.getDataHoraEvento());
    }

}
