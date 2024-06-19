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
public class Smartphone {
    
    private String marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private int bateria;
    private String chip1;
    private String chip2;
    
    Smartphone(String marca, String modelo, int rom, int ram, int bateria, String chip1, String chip2){
        this.marca = marca;
        this.modelo = modelo;
        almacenamiento = rom;
        this.ram = ram;
        this.bateria = bateria;
        this.chip1 = chip1;
        this.chip2 = chip2;  
    }
    
     
    
}
