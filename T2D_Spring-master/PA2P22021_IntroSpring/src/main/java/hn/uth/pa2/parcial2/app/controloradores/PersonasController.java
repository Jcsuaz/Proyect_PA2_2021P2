/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial2.app.controloradores;

import hn.uth.pa2.parcial2.app.modelos.Persona;
import hn.uth.pa2.parcial2.app.servicios.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author avarela
 */
@Controller
public class PersonasController {
    @Autowired
    private PersonasService servicio;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("lista", servicio.getLista());
        return "index";
    }
    
    @GetMapping("/crear")
    public String abrirFormularioCrearPersona(Model model){
        model.addAttribute("persona", new Persona());
        return "personaFormulario";
    }
    
    @GetMapping("/actualizar/{id}")
    public String abrirFormularioActualizarPersona(@PathVariable Long id,Model model){
        model.addAttribute("persona", servicio.getEntidad(id));
        return "personaFormulario";
    }
    
    @PostMapping("/guardarFormulario")
    public String guardarFormularioPersona(Persona persona,Model model){
        servicio.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id,Model model){
        servicio.eliminar(id);
        return "redirect:/";
    }
    
}
