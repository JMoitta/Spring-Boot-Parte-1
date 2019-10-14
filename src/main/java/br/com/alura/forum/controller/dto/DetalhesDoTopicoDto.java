package br.com.alura.forum.controller.dto;

import br.com.alura.forum.entity.StatusTopico;

import java.time.LocalDateTime;
import java.util.List;

public class DetalhesDoTopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;
}
