package tarea.pkg2.pkg1;

public class Turismo extends Vehiculo {
    int numeroPuertas;
    
    Turismo(int nP, String marca, String modelo, int año, double precioR){
        super(marca, modelo, año, precioR);
        numeroPuertas = nP;
    }
    
    @Override
    public void calcularCostoRenta(int dias){
        System.out.println("El costo de renta es: " +(precioR*dias)+" Lps");
    }
    
    void calcularCostosAseguranza(){
        System.out.println("El Costo de aseguranza es: "+((año*0.01)*precioR)+" Lps");
    }
        
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El numero de puertas es: "+numeroPuertas);
    }
    
}
