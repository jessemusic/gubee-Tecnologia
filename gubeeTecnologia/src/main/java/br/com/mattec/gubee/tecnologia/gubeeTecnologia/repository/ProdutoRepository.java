package br.com.mattec.gubee.tecnologia.gubeeTecnologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}