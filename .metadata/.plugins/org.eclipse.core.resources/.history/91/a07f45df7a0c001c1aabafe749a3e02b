package br.com.mattec.gubee.tecnologia.gubeeTecnologia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	public Produto findById(Long id){
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.orElse(null);
		
	}
	


}
