package br.com.alura.forum.controller;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.entity.Curso;
import br.com.alura.forum.entity.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(String nomeCurso) {
        List<Topico> topicos;
        if(nomeCurso == null) {
            topicos = topicoRepository.findAll();
        } else {
            System.out.println(nomeCurso);
            topicos = topicoRepository.findByCurso_Nome(nomeCurso);
        }
        return TopicoDto.converter(topicos);
    }
}
