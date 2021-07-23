/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.controloradores;

import hn.uth.pa2.app.modelos.Evento;
import hn.uth.pa2.app.servicios.EventoService;
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
public class EventoController {
    @Autowired
    private EventoService servicio;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("lista", servicio.getLista());
        return "index";
    }
    
    @GetMapping("/crear")
    public String abrirFormularioCrearEvento(Model model){
        model.addAttribute("evento", new Evento());
        return "eventoFormulario";
    }
    
    @GetMapping("/actualizar/{id}")
    public String abrirFormularioActualizarEvento(@PathVariable Long id,Model model){
        model.addAttribute("evento", servicio.getEntidad(id));
        return "eventoFormulario";
    }
    
    @PostMapping("/guardarFormulario")
    public String guardarFormularioEvento(Evento evento,Model model){
        servicio.guardar(evento);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarEvento(@PathVariable Long id,Model model){
        servicio.eliminar(id);
        return "redirect:/";
    }
    
}
