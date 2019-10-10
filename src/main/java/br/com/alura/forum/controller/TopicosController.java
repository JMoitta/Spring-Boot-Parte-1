package br.com.alura.forum.controller;

import br.com.alura.forum.entity.Curso;
import br.com.alura.forum.entity.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {

    @RequestMapping("/toṕicos")
    @ResponseBody
    public List<Topico> lista() {
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));
        return Arrays.asList(topico, topico, topico);
    }
}
