package br.gov.sp.fatec.Escola.model;

public class Disciplina {
	private Long id;
	private String nome;
	private Long carga_horaria;
	private String ementa;

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

	public Long getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(Long carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

}
