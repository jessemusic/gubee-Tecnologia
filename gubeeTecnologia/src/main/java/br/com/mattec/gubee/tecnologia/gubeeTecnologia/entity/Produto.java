package br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String decricao;
	private String mecardoAlvo;
	private String tecnologiaUtilizada;
	private String senha;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	

	
	public Long getId() {
		return id;
	}
	
	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
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




	public String getDecricao() {
		return decricao;
	}




	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}




	public String getMecardoAlvo() {
		return mecardoAlvo;
	}




	public void setMecardoAlvo(String mecardoAlvo) {
		this.mecardoAlvo = mecardoAlvo;
	}




	public String getTecnologiaUtilizada() {
		return tecnologiaUtilizada;
	}




	public void setTecnologiaUtilizada(String tecnologiaUtilizada) {
		this.tecnologiaUtilizada = tecnologiaUtilizada;
	}




	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}




	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
