package com.generation.EdeTodos.model;

import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
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
	private String nomecurso;
	
	@NotNull
	private float preco;
	
	@NotNull
	private String duracao;
	
	@NotBlank(message= "O atributo instrutor é obrigatório")
	@Size(min=3, max=35, message = "O atributo instrutor tem no mínimo 3 caracteres e no máximo 35 carateres")
	private String instrutor;

	private String aulas;
	
	private String descricao;
	
	private String prerequisitos;
	
	private String avaliacao;
	
	private String foto;

	@ManyToOne
	@JsonIgnoreProperties("cursos")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("cursos")
	private Usuario usuario;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomecurso() {
		return nomecurso;
	}

	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
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

	public String getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(String prerequisitos) {
		this.prerequisitos = prerequisitos;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public String getAulas() {
		return aulas;
	}

	public void setAulas(String aulas) {
		this.aulas = aulas;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
