/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.servicios;

import hn.uth.pa2.app.modelos.Pais;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.uth.pa2.app.repositorios.PaisRepositorio;

/**
 *
 * @author mbarahona
 */
@Service
public class PaisService {
    @Autowired
    private PaisRepositorio repositorio;
    
    public void guardar(Pais pais){
        repositorio.save(pais);
    }
    
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
    
    public Optional<Pais> getEntidad(Long id){
        return repositorio.findById(id);
    }
    
    public List<Pais> getLista(){
        return (List<Pais>) repositorio.findAll();
    }
    
}
