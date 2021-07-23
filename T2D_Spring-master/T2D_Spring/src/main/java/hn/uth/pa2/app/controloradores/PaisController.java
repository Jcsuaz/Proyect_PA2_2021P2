/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.controloradores;

import hn.uth.pa2.app.modelos.Pais;
import hn.uth.pa2.app.servicios.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mbarahona
 */
@Controller
public class PaisController {
    @Autowired
    private PaisService servicio;
    
    @RequestMapping("/pais")
    public String index(Model model){
        model.addAttribute("listaPais", servicio.getLista());
        return "index";
    }
    
    @GetMapping("/crearPais")
    public String abrirFormularioCrearPais(Model model){
        model.addAttribute("pais", new Pais());
        return "paisFormulario";
    }
    
    @GetMapping("/actualizarPais/{id}")
    public String abrirFormularioActualizarPais(@PathVariable Long id,Model model){
        model.addAttribute("pais", servicio.getEntidad(id));
        return "paisFormulario";
    }
    
    @PostMapping("/guardarFormularioPais")
    public String guardarFormularioPais(Pais pais,Model model){
        servicio.guardar(pais);
        return "redirect:/";
    }
    
    @GetMapping("/eliminarPais/{id}")
    public String eliminarPais(@PathVariable Long id,Model model){
        servicio.eliminar(id);
        return "redirect:/";
    }
    
}
