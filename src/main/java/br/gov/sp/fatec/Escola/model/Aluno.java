package br.gov.sp.fatec.Escola.model;

public class Aluno {
	private Long id;

	private String nome;

	private String turma_id;

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

	public String getTurma_id() {
		return turma_id;
	}

	public void setTurma_id(String turma_id) {
		this.turma_id = turma_id;
	}
}