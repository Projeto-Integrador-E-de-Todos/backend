package com.generation.EdeTodos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.EdeTodos.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
		
	public Optional<Usuario> findByLogin(String login);
	
}
