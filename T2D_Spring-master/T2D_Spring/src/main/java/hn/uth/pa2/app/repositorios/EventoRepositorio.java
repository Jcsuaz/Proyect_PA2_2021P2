/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.repositorios;

import hn.uth.pa2.app.modelos.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author avarela
 */
public interface EventoRepositorio extends CrudRepository<Evento, Long> {
    
}
