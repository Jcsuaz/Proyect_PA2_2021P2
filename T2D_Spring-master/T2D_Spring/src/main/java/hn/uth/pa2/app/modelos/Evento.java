/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.app.modelos;


import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author t2z
 */
@Data
@NoArgsConstructor
@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String codPais;
    private String codCiudad;
   @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fecInicial;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fecFinal;
    private String descripcion;
    private int precio;
    private String urlEvento;
    private String imgAfiche;    
    
}
