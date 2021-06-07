package br.gov.sp.fatec.Escola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.sp.fatec.Escola.model.Aluno;

@Controller
public class EscolaController {
	
	@RequestMapping("/escola/form")
	public String form() {
		return "formEscola";
	}
	
	
	@PostMapping("/escola")
	public String adicionar(Aluno aluno) {
		System.out.println(aluno);
		return "escola-adicionado";
	}

}
