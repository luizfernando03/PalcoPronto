package br.com.javeirosavante.palcopronto.service;

import br.com.javeirosavante.palcopronto.model.Espaco;
import br.com.javeirosavante.palcopronto.repository.EspacoRepository;
import br.com.javeirosavante.palcopronto.validator.EspacoExistenteException;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EspacoServiceImplTest {

    @Test

    public void testCriarEspacoComEspacoExistenteDeveLancarExcecao() {
       Espaco espacoExistente = Espaco.builder().idEspaco(1).build();

        Espaco espacoDto = Espaco.builder().idEspaco(1).build();


        EspacoRepository repositoryMock = mock(EspacoRepository.class);
        when(repositoryMock.findById(espacoDto.getIdEspaco())).thenReturn(Optional.of(espacoExistente));

        EspacoServiceImpl espacoService = new EspacoServiceImpl(repositoryMock);

        EspacoExistenteException excecao = assertThrows(EspacoExistenteException.class, () -> {
            espacoService.criarEspaco(espacoDto);
        });

        String mensagemEsperada = "Espaço já cadastrado";
        String mensagemRecebida = excecao.getMessage();
        assertEquals(mensagemEsperada, mensagemRecebida);
    }

}
