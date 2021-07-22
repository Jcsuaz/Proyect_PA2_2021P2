package com.example.demo.models.service;

import com.example.demo.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario FindByUsername(String username);	
	public Usuario registrar(Usuario u);

}
