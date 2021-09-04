package br.com.mattec.gubee.tecnologia.gubeeTecnologia.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;

@DataJpaTest
public class ProdutoRepositoryTest {
	
	@Autowired
	private ProdutoRepository reposi;

	@Test
	public void deveSalvarUmaTecnologiaNoBancoDeDados() {
		
		Produto produto = Produto.builder()
				.nome("Boot")
				.descricao("FrameWork para desenvolvimento")
				.mercardoAlvo("Programadores em geral")
				.dataCriacao("2021-09-02T08:11:51.2789887")
				.tecnologiaUtilizada("Spring Tool Suite")
				.build();
		
				reposi.save(produto);
				
				Assertions.assertThat(produto.getId()).isGreaterThan(0);
	}	
	
	@Test
	public void deveBuscarUmIdNoBancoDeDados() {
		Produto produto = reposi.findById(1L).get();
		Assertions.assertThat(produto.getId()).isEqualTo(1L);
	}

	
	
}
