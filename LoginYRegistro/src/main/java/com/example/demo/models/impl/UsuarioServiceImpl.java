package com.example.demo.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IUsuarioDAO;
import com.example.demo.models.service.IUsuarioService;
import com.example.demo.models.entity.Usuario;

@Service 
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private IUsuarioDAO usuarioDao;

	@Override
	public Usuario FindByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}
	
	@Override
	public Usuario registrar(Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return usuarioDao.save(u);
		
	}	
			
}
