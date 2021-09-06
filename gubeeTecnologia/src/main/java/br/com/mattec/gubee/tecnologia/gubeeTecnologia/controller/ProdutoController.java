package br.com.mattec.gubee.tecnologia.gubeeTecnologia.controller;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping("/save")
	public ResponseEntity<ProdutoDTO>  insert(@RequestBody @Valid ProdutoDTO objetoDTO){		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
		.path("/{id}").buildAndExpand(produtoService.insert(objetoDTO).getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/update")
	public ResponseEntity<Produto>  update(@RequestBody ProdutoDTO objetoDTO){	
		Produto prod = this.produtoService.findById(objetoDTO.getId());
		return prod != null ? ResponseEntity.ok()
			.body(this.produtoService.update(objetoDTO)) : ResponseEntity.notFound().build();
		
	}
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){	
		Produto prod = this.produtoService.findById(id);
		if(prod != null) {
			this.produtoService.delete(id);
		return	ResponseEntity.ok().build();
		}else {
			 return ResponseEntity.notFound().build();
		}		
	}
}
