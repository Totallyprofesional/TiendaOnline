
package cl.duoc.tiendaonline.view;

import cl.duoc.tiendaonline.controller.DescuentosController;
import java.util.Scanner;
 
public class DescuentosView {  
    
    private final DescuentosController controller;
    private final Scanner sc = new Scanner(System.in); 

    public DescuentosView(DescuentosController controller) {
        this.controller = controller; 
    }  

    public void configure() { 

    System.out.println("\n Precios");
    System.out.println("1 Descuento de Nike con Adidas");
    System.out.println("2 Descuento de Adidas con Nike");
    System.out.println("0 Sin ajustes");
    System.out.print("Opción: ");
    String op = sc.nextLine().trim(); 
 
        switch (op) { 
            case "1" -> {
                System.out.print("¿Activar descuentos Nike + Adidas? (s/n): ");
                boolean on = sc.nextLine().trim().equalsIgnoreCase("s");
                controller.setProceso1(on);	
            }
	    case "2" -> {
	        System.out.print("¿Activar descuentos Adidas + Nike? (s/n): ");
	        boolean on = sc.nextLine().trim().equalsIgnoreCase("s");
	        controller.setProceso2(on);
	    }
            case "0" -> controller.clear();
	        default -> System.out.println("Opción no válida");
        } 
    }

} 

 