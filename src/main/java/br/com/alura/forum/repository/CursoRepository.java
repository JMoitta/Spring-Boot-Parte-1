package br.com.alura.forum.repository;

import br.com.alura.forum.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Long> {
    Curso findByName(String nome);
}
