package com.generation.EdeTodos.model;


import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Insira seu nome de usuario")
	@Size(min = 2, message = "no minimo 2 caracteres ")
	private String nome;

	@Schema(example = "email@email.com.br")
	@NotBlank(message = "Insira login de usuario")
	@Email(message = "O atributo usuario tem que receber um e-mail válido")
	private String login;
	
	@NotBlank(message = "Insira sua senha de usuario")
	@Size(min = 8, message = "no minimo 8 caracteres")
	private String senha;

	@JsonFormat(pattern = "dd.MM.yyyy")
	private LocalDate data_nas;

	@NotBlank(message = "Insira o endereço URL da foto")
	@Size(min = 10, message = "no minimo 10 caracteres")
	private String foto;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Cursos> cursos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getData_nas() {
		return data_nas;
	}

	public void setData_nas(LocalDate data_nas) {
		this.data_nas = data_nas;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(List<Cursos> cursos) {
		this.cursos = cursos;
	}
}
