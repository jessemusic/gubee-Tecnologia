package br.com.mattec.gubee.tecnologia.gubeeTecnologia.DTO;

import java.time.LocalDateTime;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;

public class ProdutoDTO {
	
	private Long id;
	private String nome;
	private String decricao;
	private String mecardoAlvo;
	private LocalDateTime dataCriacao;
	private String tecnologiaUtilizada;
	
	public ProdutoDTO(Produto produto) {
		this.id =  produto.getId();
		this.nome = produto.getNome();
		this.decricao = produto.getDecricao();
		this.mecardoAlvo = produto.getMecardoAlvo();
		this.dataCriacao = produto.getDataCriacao();
		this.tecnologiaUtilizada = produto.getTecnologiaUtilizada();
	}
  public ProdutoDTO() {
  }
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

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTecnologiaUtilizada() {
		return tecnologiaUtilizada;
	}

	public void setTecnologiaUtilizada(String tecnologiaUtilizada) {
		this.tecnologiaUtilizada = tecnologiaUtilizada;
	}

}
