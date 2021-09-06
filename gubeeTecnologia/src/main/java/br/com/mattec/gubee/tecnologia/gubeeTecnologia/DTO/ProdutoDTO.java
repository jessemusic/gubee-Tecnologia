package br.com.mattec.gubee.tecnologia.gubeeTecnologia.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity.Produto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class ProdutoDTO {

	private Long id;
	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private String descricao;
	@NotNull @NotEmpty
	private String mercadoAlvo;
	@NotNull @NotEmpty
	private String tecnologiaUtilizada;
	
	public ProdutoDTO(Produto produto) {
		id =  produto.getId();
		nome = produto.getNome();
		descricao = produto.getDescricao();
		mercadoAlvo = produto.getMercadoAlvo();
		tecnologiaUtilizada = produto.getTecnologiaUtilizada();
	}
	
}
