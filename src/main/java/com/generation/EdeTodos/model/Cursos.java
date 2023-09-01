package com.generation.EdeTodos.model;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_cursos")
public class Cursos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="O atributo é obrigatório")
	@Size(min=5, max=50, message = "O atributo nome do curso tem no mínimo 5 caracteres e no máximo 50 carateres")
	private String nome_curso;
	
	@NotNull
	private float preco;
	
	@NotNull
	private Time duracao;
	
	@NotBlank(message= "O atributo instrutor é obrigatório")
	@Size(min=3, max=35, message = "O atributo instrutor tem no mínimo 3 caracteres e no máximo 35 carateres")
	private String instrutor;
	
	private String descricao;
	
	private String pre_requisitos;
	
	private String avaliacao;
	
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Time getDuracao() {
		return duracao;
	}

	public void setDuracao(Time duracao) {
		this.duracao = duracao;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPre_requisitos() {
		return pre_requisitos;
	}

	public void setPre_requisitos(String pre_requisitos) {
		this.pre_requisitos = pre_requisitos;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}
