package tarea.pkg1.pkg1;

public class Tarea11 {

    public static void main(String[] args) {
        
        System.out.println("Zabdi Ventura"); 
        
        Fabricante f1 = new Fabricante("Samsung Group", "Corea del Sur"); 
        
        Operador o1 = new Operador("Claro", "Honduras");
        
        Chip chip1 = new Chip(o1, 4545454);
        Chip chip2 = new Chip(o1, 4565898);
        
        Smartphone samsung = new Smartphone("Samsung","S10",64,6,4000, chip1, chip2);
        
        System.out.println(f1.nombre);
        System.out.println(f1.pais);
        samsung.MostrarInfo();
        
    }
    
}
