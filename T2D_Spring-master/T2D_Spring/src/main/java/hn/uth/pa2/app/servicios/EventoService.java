/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.servicios;

import hn.uth.pa2.app.modelos.Evento;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.uth.pa2.app.repositorios.EventoRepositorio;

/**
 *
 * @author avarela
 */
@Service
public class EventoService {
    @Autowired
    private EventoRepositorio repositorio;
    
    public void guardar(Evento evento){
        repositorio.save(evento);
    }
    
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
    
    public Optional<Evento> getEntidad(Long id){
        return repositorio.findById(id);
    }
    
    public List<Evento> getLista(){
        return (List<Evento>) repositorio.findAll();
    }
    
}
