package br.gov.sp.fatec.Escola.model;

public class Curso {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getPeridiocidade() {
		return peridiocidade;
	}

	public void setPeridiocidade(Long peridiocidade) {
		this.peridiocidade = peridiocidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private String nome;
	private Long peridiocidade;
	private String descricao;

}
