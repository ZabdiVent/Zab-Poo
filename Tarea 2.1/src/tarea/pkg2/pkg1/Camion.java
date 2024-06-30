package tarea.pkg2.pkg1;

public class Camion extends Vehiculo {
    int capacidadDeCarga;
    
    Camion(int cdC, String marca, String modelo, int año, double precioR){
        super(marca, modelo, año, precioR);
        capacidadDeCarga = cdC;
    }
    
    @Override
    public void calcularCostoRenta(int dias){
        double re;
        re = (precioR*dias)*0.20;
        System.out.println("El costo de renta es: " +(re+(precioR*dias))+" Lps");
    }
    
    void calcularCostosAseguranza(){
        System.out.println("El Costo de aseguranza es: "+((año*0.015)*precioR)+" Lps");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("La capacidad es de: "+capacidadDeCarga+" Lbs");
    }
    
}
