package com.tav.av2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tav.av2.model.Cliente;
import com.tav.av2.repository.ClienteRepository;
import com.tav.av2.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	ClienteRepository clienterepository;
	
	@Autowired
	ClienteService clienteservice;
	
	//
	public ClienteController(ClienteRepository clienterepository) {
		
		this.clienterepository = clienterepository;
		
	}
	//
	
	//Listar Clientes
	@RequestMapping("/listarclientes")
	public String listarclientes(Model model){
		
		model.addAttribute("cliente",clienterepository.findAll());
		return "listarclientes";
		
	}
	
	//Cadastrar Cliente
	@GetMapping("/cadastrocliente")
	public String Insertcliente(Model model) {
		
		model.addAttribute("cliente",new Cliente());
		
		return "cadastrocliente";
		
	}
	
	//Redirect cadastro
	@PostMapping("/process")
	public String processForm(@Valid Cliente cliente,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "cadastrocliente";
			
		}
		
		clienterepository.save(cliente);
		
		return "redirect:/";
		
	}
	
	@RequestMapping(value="/listarclientescpf", method = RequestMethod.GET)
	public ModelAndView pesquisarcpf(@RequestParam(name="cpfpesquisa",required=false) String cpf){
		
		ModelAndView mv = new ModelAndView("listarclientescpf");
		
		mv.addObject("cliente",clienterepository.findByCpf(cpf));
		mv.addObject("clienteobj",new Cliente());
		
		return mv;
	}
	
}
