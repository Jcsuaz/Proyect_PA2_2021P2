/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial2.app.controloradores;

import hn.uth.pa2.parcial2.app.modelos.Persona;
import hn.uth.pa2.parcial2.app.servicios.PersonasService;
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
 *
 * @author avarela
 */
@RestController
@RequestMapping("/ws/personas/")
public class PersonasRestController {
    @Autowired
    private PersonasService servicio;
    
    @GetMapping("/")
    public List<Persona> getListaPersonas(){
        return servicio.getLista();
    }
    
    @GetMapping("/{id}")
    public Optional<Persona> getPersonaById(@PathVariable Long id){
        return servicio.getEntidad(id);
    }
    
    @PostMapping("/guardar")
    public String guardar(@RequestBody Persona persona){
        servicio.guardar(persona);
        return "elemento guardado";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return "elemento eliminado";
    }
}
