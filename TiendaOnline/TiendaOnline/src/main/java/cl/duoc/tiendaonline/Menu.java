
package cl.duoc.tiendaonline;

import cl.duoc.tiendaonline.controller.DescuentosController;
import cl.duoc.tiendaonline.controller.PedidosController;
import cl.duoc.tiendaonline.controller.ProductosController;
import cl.duoc.tiendaonline.model.Pedidos;
import cl.duoc.tiendaonline.view.DescuentosView;
import cl.duoc.tiendaonline.view.PedidosView;
import cl.duoc.tiendaonline.view.ProductosView;
import java.util.Scanner;
 
public class Menu {    
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
     
        ProductosController productosController = new ProductosController();
	PedidosController pedidosController = new PedidosController(new Pedidos());
	DescuentosController descuentosController = new DescuentosController();
        
	ProductosView productosView = new ProductosView(productosController);
	PedidosView pedidosView = new PedidosView(pedidosController);
	DescuentosView descuentosView = new DescuentosView(descuentosController);

        do { 
            System.out.println("\n Bienvenido al Menu de Tienda Online");
            System.out.println("1. Ver productos");
            System.out.println("2. Realizar pedido");
            System.out.println("3. Cancelar pedido"); ;
            System.out.println("4. Ver pedidos");
            System.out.println("5. Configurar descuentos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: "); 
 
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {  
                case 1:
                    productosView.mostrarProductos();
                    break; 
                case 2: 
                    comprarArticulos();
                    break; 
                case 3:
                    verDescuentos(totalAdidas, totalNike);
                    break;
                case 4:
                    balanceTotal();
                    break;
                case 5:
                    balanceTotal();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 6);
       
    } 
    
    private static int parseIntSafe(String s) {
	try {
	    return Integer.parseInt(s.trim());
	} catch (Exception e) {
	    return -1;
	}
    }
    
}
 