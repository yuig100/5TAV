package com.tav.av2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tav.av2.model.Orcamento;
import com.tav.av2.repository.OrcamentoRepository;
import com.tav.av2.repository.ProcedimentoRepository;

@Controller
@RequestMapping("/orcamento")
public class OrcamentoController {

	@Autowired
	OrcamentoRepository orcamentorepository;
	
	@Autowired
	ProcedimentoRepository procedimentorepository;

	//
	public OrcamentoController(OrcamentoRepository orcamentorepository) {

		this.orcamentorepository = orcamentorepository;

	}
	//

	// Cadastrar Orcamento
	@GetMapping("/cadastroorcamento")
	public String Insertorcamento(Model model) {

		model.addAttribute("orcamento", new Orcamento());

		return "orcamentoprocedimento";

	}

	// Redirect orcamento
	@PostMapping("/process")
	public String processForm(@Valid Orcamento orcamento, BindingResult result) {

		if (result.hasErrors()) {

			return "orcamentoprocedimento";

		}

		orcamentorepository.save(orcamento);

		return "redirect:/pedido_aprovacao/aprovarorcamento";

	}
	
}
