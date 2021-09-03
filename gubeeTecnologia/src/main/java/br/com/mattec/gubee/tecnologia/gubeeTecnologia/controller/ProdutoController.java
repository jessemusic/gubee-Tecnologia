package br.com.mattec.gubee.tecnologia.gubeeTecnologia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.controller.DTO.ProdutoDTO;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.service.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProdutoDTO>>  findAll(){	
		
		List<Produto> produtos = produtoService.findAll();
		List<ProdutoDTO> listDTO= ProdutoDTO.converter(produtos);
		return ResponseEntity.ok().body(listDTO);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProdutoDTO>  findById(@PathVariable Long id){			
		Produto produto = produtoService.findById(id);		
		return ResponseEntity.ok().body(new ProdutoDTO(produto));
	}
	
	
	
}
