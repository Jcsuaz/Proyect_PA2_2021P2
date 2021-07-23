/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.controloradores;

import hn.uth.pa2.app.modelos.Evento;
import hn.uth.pa2.app.servicios.EventoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@RequestMapping("ws/eventos/")
 * @author avarela
 */
@RestController
@RequestMapping("/ws/eventos")
public class EventoRestController {
    @Autowired
    private EventoService servicio;
    
    @GetMapping("/")
    public List<Evento> getListaEvento(){
        return servicio.getLista();
    }
    
    @GetMapping("/{id}")
    public Optional<Evento> getEventoById(@PathVariable Long id){
        return servicio.getEntidad(id);
    }
    
    @PostMapping("/guardar")
    public String guardar(@RequestBody Evento evento){
        servicio.guardar(evento);
        return "elemento guardado";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return "elemento eliminado";
    }
}
