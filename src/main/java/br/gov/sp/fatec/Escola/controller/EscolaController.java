package br.gov.sp.fatec.Escola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EscolaController {
	
	@RequestMapping("/escola/form")
	public String form() {
		return "formEscola";
	}

}
