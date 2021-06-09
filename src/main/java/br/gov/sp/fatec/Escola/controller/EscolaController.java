package br.gov.sp.fatec.Escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.sp.fatec.Escola.model.Aluno;
import br.gov.sp.fatec.Escola.repository.EscolaRepository;

@Controller
public class EscolaController {
	
	@Autowired
	private EscolaRepository er;
	
	
	@RequestMapping("/escola/form")
	public String form() {
		return "formEscola";
	}
	
	
	@PostMapping("/escola")
	public String adicionar(Aluno aluno) {
		System.out.println(aluno);
		er.save(aluno);
		return "escola-adicionado";
	}

}
