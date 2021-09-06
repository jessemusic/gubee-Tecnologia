package br.com.mattec.gubee.tecnologia.gubeeTecnologia.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.DTO.ProdutoDTO;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;

@Component
public class ProdutoMapper {

	public List<ProdutoDTO> converter(List<Produto> produtos) {
		return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
	}
	
	public ProdutoDTO mapperTwo(Produto produto) {
	ProdutoDTO	produtoDTO = new ProdutoDTO();
	produtoDTO.setId(produto.getId());
	produtoDTO.setDescricao(produto.getDescricao());
	produtoDTO.setMercadoAlvo(produto.getMercadoAlvo());
	produtoDTO.setNome(produto.getNome());
	produtoDTO.setTecnologiaUtilizada(produto.getTecnologiaUtilizada());
	return produtoDTO;
	
	}
}
