package tarea.pkg2.pkg1;

public class Camion extends Vehiculo {
    int capacidadDeCarga;
    
    Camion(int cdC, String marca, String modelo, int año, double precioR){
        super(marca, modelo, año, precioR);
        capacidadDeCarga = cdC;
    }
    
    @Override
    public void calcularCostoRenta(int dias){
        
    }
}
