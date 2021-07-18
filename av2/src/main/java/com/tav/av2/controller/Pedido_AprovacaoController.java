package com.tav.av2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tav.av2.model.Pedido_Aprovacao;
import com.tav.av2.repository.Pedido_AprovacaoRepository;

@Controller
@RequestMapping("/pedido_aprovacao")
public class Pedido_AprovacaoController {
	
	@Autowired
	Pedido_AprovacaoRepository pedido_aprovacaorepository;
	
	//
	public  Pedido_AprovacaoController(Pedido_AprovacaoRepository pedido_aprovacaorepository) {
		
		this.pedido_aprovacaorepository = pedido_aprovacaorepository;
		
	}
	//
	
	//Aprovar Orcamento
	@GetMapping("/aprovarorcamento")
	public String Aprovacaoorcamento(Model model) {
		
		model.addAttribute("pedido_aprovacao",new Pedido_Aprovacao());
		
		return "aprovarorcamento";
		
	}
	
	//Redirect aprovacao
	@PostMapping("/process")
	public String processForm(Pedido_Aprovacao pedido,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "aprovarorcamento";
			
		}
		
		pedido_aprovacaorepository.save(pedido);
		
		return "redirect:/";
		
	}
	
	
}
