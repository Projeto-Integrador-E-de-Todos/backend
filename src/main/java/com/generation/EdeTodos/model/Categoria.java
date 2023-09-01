package com.generation.EdeTodos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank(message = "O Atributo ensino é obrigatório")
@Size(min = 5, max = 45, message = "O Atributo ensino deve ter no mínimo 5 caracteres e no máximo 45 caracteres")
private String ensino;

@NotBlank(message = "O Atributo assunto é obrigatório")
@Size(min = 5, max = 45, message = "O Atributo assunto deve ter no mínimo 5 caracteres e no máximo 45 caracteres")
private String assunto;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getEnsino() {
	return ensino;
}

public void setEnsino(String ensino) {
	this.ensino = ensino;
}

public String getAssunto() {
	return assunto;
}

public void setAssunto(String assunto) {
	this.assunto = assunto;
}




}