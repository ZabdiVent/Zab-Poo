package tarea.pkg2.pkg1;

abstract class Vehiculo {
    String marca;
    String modelo;
    int año;
    double precioR;
    
    Vehiculo(String marca, String modelo, int año, double precioR){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioR = precioR;  
    }
    
    public void calcularCostoRenta(int dias){   
        
    }
    
    public void mostrarInfo(){
        System.out.println("La marca: "+marca+", el modelo: "+modelo+", el año: "+año+", el precio de renta: "+precioR);
    }
}
