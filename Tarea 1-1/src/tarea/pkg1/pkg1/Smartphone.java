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
    private int rom;
    private int ram;
    private int bateria;
    private final Chip chip1;
    private final Chip chip2;
    
    Smartphone(String marca, String modelo, int rom, int ram, int bateria, Chip chip1, Chip chip2){
        this.marca = marca;
        this.modelo = modelo;
        this.rom = rom;
        this.ram = ram;
        this.bateria = bateria;
        this.chip1 = chip1;
        this.chip2 = chip2;
    }
    
    void setMarca(String marca){
        this.marca = marca;
    }
    String getMarca(){
        return this.marca;
    }
    
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return this.modelo;
    }
    
    void setRom(int rom){
        this.rom = rom;
    }
    int getRom(){
        return this.rom;
    }
    
    void setRam(int ram){
        this.ram = ram;
    }
    int getRam(){
        return this.ram;
    }
    
    void setBateria(int bateria){
        this.bateria = bateria;
    }
    int getBateria(){
        return this.bateria;
    }       
      
    void MostrarInfo(){
        System.out.println("Marca: " + this.marca + ", Modelo: "+ this.modelo + ", Almacenamiento: "+ this.rom + "GB"+ 
                ", Bateria: "+this.bateria + "mah");
        
        System.out.println("Chip 1: " + " El Operador "+chip1.getNombreOP()+ ", el Pais "+chip1.getPaisOP()+"; El Numero: "+chip1.numero);
        System.out.println("Chip 2: " + " El Operador "+chip2.getNombreOP()+ ", el Pais "+chip2.getPaisOP()+"; El Numero: "+chip2.numero);
    }
    
}
