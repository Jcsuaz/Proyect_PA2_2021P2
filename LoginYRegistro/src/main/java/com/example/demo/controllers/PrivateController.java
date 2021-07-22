package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.entity.Usuario;
import com.example.demo.models.service.IUsuarioService;

@Controller
@RequestMapping("/private") 
public class PrivateController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/index")
	public String index(Authentication auth, HttpSession session) {
		
		String username = auth.getName();
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.FindByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "index";
		
	}
	

}
