package br.com.mattec.gubee.tecnologia.gubeeTecnologia.DTO;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;

public class ProdutoDTO {
	
	private Long id;
	private String nome;
	private String descricao;
	private String mercardoAlvo;
	private String dataCriacao;
	private String tecnologiaUtilizada;
	
	public ProdutoDTO(Produto produto) {
		this.id =  produto.getId();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.mercardoAlvo = produto.getMercardoAlvo();
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMercardoAlvo() {
		return mercardoAlvo;
	}

	public void setMercardoAlvo(String mercardoAlvo) {
		this.mercardoAlvo = mercardoAlvo;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTecnologiaUtilizada() {
		return tecnologiaUtilizada;
	}

	public void setTecnologiaUtilizada(String tecnologiaUtilizada) {
		this.tecnologiaUtilizada = tecnologiaUtilizada;
	}

}
