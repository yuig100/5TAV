package com.tav.av2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tav.av2.repository.UsuarioRepository;

@Controller
@RequestMapping("/")
public class UsuarioController{

	@Autowired
	UsuarioRepository usuariorepository;

}
