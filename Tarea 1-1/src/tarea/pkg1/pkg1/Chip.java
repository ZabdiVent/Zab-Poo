/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1.pkg1;

/**
 *
 * @author zabdi
 */
public class Chip {
    private final Operador operador;
    public int numero;
    
    Chip(Operador operador, int numero){
        this.numero = numero;
        this.operador = operador;
    }
    
    String getNombreOP(){
        return this.operador.nombre;
    }
    
    String getPaisOP(){
        return this.operador.pais;
    }
    
}
