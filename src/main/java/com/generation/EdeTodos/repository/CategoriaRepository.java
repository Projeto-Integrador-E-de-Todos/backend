package com.generation.EdeTodos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.EdeTodos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List <Categoria> findAllByEnsinoContainingIgnoreCase(@Param ("ensino") String ensino);
	public List <Categoria> findAllByAssuntoContainingIgnoreCase(@Param ("assunto") String assunto);
	
}
