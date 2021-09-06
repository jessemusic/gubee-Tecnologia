package br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="produto")
public class Produto {
	
	public Produto( String nome2, String descricao2, String mercadoAlvo2, String tecnologiaUtilizada2) {
		this.nome = nome2;
		this.descricao= descricao2;
		this.mercadoAlvo = mercadoAlvo2;
		this.tecnologiaUtilizada = tecnologiaUtilizada2;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull @NotEmpty
	@Column(name = "nome", nullable = false)
	private String nome;
	@NotNull @NotEmpty
	@Column(name = "descricao", nullable = false)
	private String descricao;
	@NotNull @NotEmpty
	@Column(name = "mercado_alvo", nullable = false)
	private String mercadoAlvo;
	@NotNull @NotEmpty
	@Column(name = "tecnologia_utilizada", nullable = false)
	private String tecnologiaUtilizada;
	@Column(name = "senha", nullable = true)
	private String senha;
	@Column(name = "data_criacao", nullable = true)
	private String dataCriacao;
		
}
