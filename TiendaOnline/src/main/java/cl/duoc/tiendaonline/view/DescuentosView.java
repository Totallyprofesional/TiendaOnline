
package cl.duoc.tiendaonline.view;

import java.util.Scanner;
 
public class DescuentosView { 
    
    private final PricingController controller;
	private final Scanner sc = new Scanner(System.in);

	public PricingView(PricingController controller) {

		this.controller = controller;
	}

	public void configure() { 

		System.out.println("\nPrecios");
		System.out.println("1 Pipeline simple con VIP y matiné");
		System.out.println("2 Pipeline con 3D, VIP y matiné");
		System.out.println("0 Sin ajustes");
		System.out.print("Opción: ");
		String op = sc.nextLine().trim();

		switch (op) {

		case "1" -> {

			System.out.print("¿Matiné activo s o n? ");
			boolean on = sc.nextLine().trim().equalsIgnoreCase("s");
			controller.setSimplePipeline(on);
		}

		case "2" -> {

			System.out.print("¿Matiné activo s o n? ");
			boolean on = sc.nextLine().trim().equalsIgnoreCase("s");
			controller.setThreeDPlusVip(on);
		}

		case "0" -> controller.clear();

		default -> System.out.println("Opción no válida");
		}
	}
}

 