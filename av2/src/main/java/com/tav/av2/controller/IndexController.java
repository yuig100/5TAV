package com.tav.av2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{
	
	@RequestMapping("/")
	public String index() {

		return "index";

	}
	/*
	@RequestMapping("/cadastrocliente")
	public String cadastrocliente() {

		return "cadastrocliente";

	}
	
	@RequestMapping("/listarclientes")
	public String listarclientes() {

		return "listarclientes";

	}
	*/
}
