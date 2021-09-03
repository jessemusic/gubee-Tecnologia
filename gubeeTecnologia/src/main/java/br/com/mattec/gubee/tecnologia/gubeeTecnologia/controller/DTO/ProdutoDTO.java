package br.com.mattec.gubee.tecnologia.gubeeTecnologia.controller.DTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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
	
	

	public String getTecnologiaUtilizada() {
		return tecnologiaUtilizada;
	}



	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getDecricao() {
		return decricao;
	}


	public String getMecardoAlvo() {
		return mecardoAlvo;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public static List<ProdutoDTO> converter(List<Produto> produtos) {
		
		return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
	}
	
	

}
