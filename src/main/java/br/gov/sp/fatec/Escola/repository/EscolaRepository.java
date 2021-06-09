package br.gov.sp.fatec.Escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.Escola.model.Aluno;

public interface EscolaRepository extends JpaRepository<Aluno, Long>{

}
