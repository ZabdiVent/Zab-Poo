package tarea.pkg2.pkg1;

public class Moto extends Vehiculo{
    int capacidadMotor;
    
    Moto(int cM, String marca, String modelo, int año, double precioR){
        super(marca, modelo, año, precioR);
        capacidadMotor = cM;
    }
    
    @Override
    public void calcularCostoRenta(int dias){
        double re;
        re = (precioR*dias)*0.20;
        System.out.println("El costo de renta es: " +((precioR*dias)-re));
    }
    
    void calcularCostosAseguranza(){
        System.out.println("El Costo de aseguranza es: "+(año*0.005)*precioR);
    }
    
}
