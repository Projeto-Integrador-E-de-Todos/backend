package com.generation.EdeTodos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Cursos> cursos;



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

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}
}
