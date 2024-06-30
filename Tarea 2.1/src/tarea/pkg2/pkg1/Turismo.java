package tarea.pkg2.pkg1;

public class Turismo extends Vehiculo {
    int numeroPuertas;
    
    Turismo(int nP, String marca, String modelo, int año, double precioR){
        super(marca, modelo, año, precioR);
        numeroPuertas = nP;
    }
    
    @Override
    public void calcularCostoRenta(int dias){
        System.out.println(precioR*dias);
    }
    
    void calcularCostosAseguranza(){
        System.out.println((año*0.01)*precioR);
    }
    
}
