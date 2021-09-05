package br.com.mattec.gubee.tecnologia.gubeeTecnologia.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.DTO.ProdutoDTO;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;
import br.com.mattec.gubee.tecnologia.gubeeTecnologia.service.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<ProdutoDTO>>  findAll(){	
		return ResponseEntity.ok().body(this.produtoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO>  findById(@PathVariable Long id){				
		return ResponseEntity.ok().body(new ProdutoDTO(produtoService.findById(id)));
	}
	
	@GetMapping("/nome")
	public ResponseEntity<List<ProdutoDTO>>  findByNome(@RequestParam List<String> nome){		
		return nome != null ? ResponseEntity.ok().body(this.produtoService
				.findByNome(nome)) : ResponseEntity.badRequest().build();
	}
	
//	@PostMapping()
//	public ResponseEntity<Void>  insert(@RequestBody ProdutoDTO objetoDTO){	
//		Produto produto = produtoService.fromDTO(objetoDTO);
//		produto = produtoService.insert(produto);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
//	
	

	
}
