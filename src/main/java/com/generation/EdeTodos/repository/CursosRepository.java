package com.generation.EdeTodos.repository;

import com.generation.EdeTodos.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CursosRepository extends JpaRepository<Cursos, Long> {

    public List<Cursos> findAllByNomecursoContainingIgnoreCase(@Param("nomecurso")String nomecurso);

    public List<Cursos> findAllByInstrutorContainingIgnoreCase(@Param("instrutor")String instrutor);


}
