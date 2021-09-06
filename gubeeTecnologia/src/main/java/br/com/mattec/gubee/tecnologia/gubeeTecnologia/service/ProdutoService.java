package br.com.mattec.gubee.tecnologia.gubeeTecnologia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.DTO.ProdutoDTO;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.mapper.ProdutoMapper;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ProdutoMapper produtoMapper;

	public List<ProdutoDTO> findAll(){
		return  this.produtoMapper.converter(this.produtoRepository.findAll());
	}
	
	public Produto findById(Long id){
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.orElse(null);	
	}
	
	public List<ProdutoDTO> findByNome(List<String> nome){
		return  this.produtoMapper.converter(this.produtoRepository.findByNomeIn(nome));
	}
	
	public Produto insert(ProdutoDTO retProduto) {
		retProduto.setId(null);// se o id chegar como null esse método vai entender que é para atualizar e não inserir
		return produtoRepository.save(this.fromDTO(retProduto));
	}
	
	public Produto update(ProdutoDTO retProduto) {
		Optional<Produto> prod = produtoRepository.findById(retProduto.getId());
		if(prod.isPresent()) {
			prod.get().setNome(retProduto.getNome());
			prod.get().setDescricao(retProduto.getDescricao());
			prod.get().setMercadoAlvo(retProduto.getMercadoAlvo());
			prod.get().setTecnologiaUtilizada(retProduto.getTecnologiaUtilizada());		
		return	produtoRepository.save(prod.get());
		}
		return null;
	}

	public Produto fromDTO(ProdutoDTO objetoDTO) {
		return new Produto(
				objetoDTO.getNome(),
				objetoDTO.getDescricao(),
				objetoDTO.getMercadoAlvo(),
				objetoDTO.getTecnologiaUtilizada());	
	}

	public void delete(Long id) {
		Optional<Produto> prod = produtoRepository.findById(id);
		if(prod.isPresent()) {
			produtoRepository.deleteById(id);
		}
	}
}
