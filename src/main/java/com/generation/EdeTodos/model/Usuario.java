package com.generation.EdeTodos.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	@Size(min = 2, max = 50, message = "no minimo 2 caracteres e no maximo 50")
	private String nome;
	
	@NotBlank(message = "Insira login de usuario")
	@Size(min = 6, max = 45, message = "no minimo 2 caracteres e no maximo 45")
	private String login;
	
	@NotBlank(message = "Insira sua senha de usuario")
	@Size(min = 2, max = 45, message = "no minimo 2 caracteres e no maximo 45")
	private String senha;
	
	@NotNull(message = "Insira sua data de nascimento")
	private Date data_nas;

	@NotBlank(message = "Insira o endereço URL da foto")
	@Size(min = 10, max = 45, message = "no minimo 10 caracteres e no maximo 45")
	private String foto;
	
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

	public Date getData_nas() {
		return data_nas;
	}

	public void setData_nas(Date data_nas) {
		this.data_nas = data_nas;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	
	

}
