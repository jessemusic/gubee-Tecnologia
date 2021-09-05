package br.com.mattec.gubee.tecnologia.gubeeTecnologia.DTO;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;

public class ProdutoDTO {

	private Long id;
	private String nome;
	private String descricao;
	private String mercadoAlvo;
	private String tecnologiaUtilizada;
	
	public ProdutoDTO(Produto produto) {
		this.id =  produto.getId();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.mercadoAlvo = produto.getMercadoAlvo();
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

	public String getMercadoAlvo() {
		return mercadoAlvo;
	}

	public void setMercadoAlvo(String mercadoAlvo) {
		this.mercadoAlvo = mercadoAlvo;
	}


	public String getTecnologiaUtilizada() {
		return tecnologiaUtilizada;
	}

	public void setTecnologiaUtilizada(String tecnologiaUtilizada) {
		this.tecnologiaUtilizada = tecnologiaUtilizada;
	}

}
