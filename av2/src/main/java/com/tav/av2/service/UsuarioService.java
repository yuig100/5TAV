package com.tav.av2.service;

import com.tav.av2.model.Usuario;

public interface UsuarioService {

	Usuario autenticar(String user, String senha);
	
	Usuario cadastro_usuario(Usuario usuario);
	
	void validar_email(String email);

}
