/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.controloradores;

import hn.uth.pa2.app.modelos.Pais;
import hn.uth.pa2.app.servicios.PaisService;
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
@RequestMapping("/ws/paises")
public class PaisRestController {
    @Autowired
    private PaisService servicio;
    
    @GetMapping("/pais")
    public List<Pais> getListaPais(){
        return servicio.getLista();
    }
    
    @GetMapping("/{id}")
    public Optional<Pais> getPaisById(@PathVariable Long id){
        return servicio.getEntidad(id);
    }
    
    @PostMapping("/guardarPais")
    public String guardar(@RequestBody Pais pais){
        servicio.guardar(pais);
        return "elemento guardado";
    }
    
    @GetMapping("/eliminarPais/{id}")
    public String eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return "elemento eliminado";
    }
}
