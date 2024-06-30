package tarea.pkg2.pkg1;


public class Tarea21 {

    
    public static void main(String[] args) {      
        
        Turismo t1 = new Turismo(4, "Toyota", "Hilux", 2021, 6500);
        t1.calcularCostoRenta(7);
        t1.calcularCostosAseguranza();
        
        System.out.println("");
        
        Camion c1= new Camion(150, "Kia", "K3000", 2019, 5000);
        c1.calcularCostoRenta(4);
        c1.calcularCostosAseguranza();
        
        System.out.println("");
        
        Moto m1 = new Moto(155, "Yamaha", "MT15", 2023, 6000);
        m1.calcularCostoRenta(2);
        m1.calcularCostosAseguranza();
    }
    
}
