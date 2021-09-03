package br.com.mattec.gubee.tecnologia.gubeeTecnologia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	
	List<Produto> findByNomeIn(List<String> nome);
		
	
}
