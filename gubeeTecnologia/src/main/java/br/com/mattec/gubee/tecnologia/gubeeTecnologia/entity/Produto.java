package br.com.mattec.gubee.tecnologia.gubeeTecnologia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "descricao", nullable = false)
	private String descricao;
	@Column(name = "mercado_alvo", nullable = false)
	private String mercadoAlvo;
	@Column(name = "tecnologia_utilizada", nullable = false)
	private String tecnologiaUtilizada;
	@Column(name = "senha", nullable = true)
	private String senha;
	@Column(name = "data_criacao", nullable = true)
	private String dataCriacao;
	
	
}
