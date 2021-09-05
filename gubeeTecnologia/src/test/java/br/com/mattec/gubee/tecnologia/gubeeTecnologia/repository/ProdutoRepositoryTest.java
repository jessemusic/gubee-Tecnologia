package br.com.mattec.gubee.tecnologia.gubeeTecnologia.repository;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProdutoRepositoryTest {
	
	@Autowired
	private ProdutoRepository reposi;

	@Test
	@Order(1)
	@Rollback(value = false)
	public void deveSalvarUmaTecnologiaNoBancoDeDados() {
		
		Produto produto = Produto.builder()
				.nome("Boot")
				.descricao("FrameWork para desenvolvimento")
				.mercadoAlvo("Programadores em geral")
				.dataCriacao("2021-09-02T08:11:51.2789887")
				.tecnologiaUtilizada("Spring Tool Suite")
				.build();
		
				reposi.save(produto);
				
				Assertions.assertThat(produto.getId()).isGreaterThan(0);
	}	
	
	@Test
	@Order(2)
	public void deveBuscarUmIdNoBancoDeDados() {
		Produto produto = reposi.findById(1L).get();
		Assertions.assertThat(produto.getId()).isEqualTo(1L);
	}
	
	@Test
	@Order(3)
	public void deveBuscarUmaListaNoBancoDeDados() {
		List<Produto> produto = reposi.findAll();
		Assertions.assertThat(produto.size()).isGreaterThan(0);
	}
	
	@Test
	@Order(4)
	@Rollback(value = false)
	public void deveAtualizarUmProdutoNoBancoDeDados() {
		Produto produto = reposi.findById(1L).get();
		
		produto.setDescricao("FrameWork para desenvolvimento 2");
		
		Produto produtoAlterado = reposi.save(produto);
		Assertions.assertThat(produtoAlterado.getDescricao()).isEqualTo("FrameWork para desenvolvimento 2");
	}
	
	@Test
	@Order(5)
	@Rollback(value = false)
	public void deveDeletarUmProdutoNoBancoDeDados() {
		Produto produto = reposi.findById(1L).get();
		
		reposi.delete(produto);
		
		Produto produtoOne = null;
		
		Optional<Produto> optionalProduto = reposi.findById(1L);
		if(optionalProduto.isPresent()) {
			produtoOne = optionalProduto.get();
		}
		
		Assertions.assertThat(produtoOne).isNull();
	}

}
