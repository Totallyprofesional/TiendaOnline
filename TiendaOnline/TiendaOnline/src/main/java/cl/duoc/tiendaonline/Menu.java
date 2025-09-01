
package cl.duoc.tiendaonline;

import cl.duoc.tiendaonline.controller.DescuentosController;
import cl.duoc.tiendaonline.controller.PedidosController;
import cl.duoc.tiendaonline.controller.ProductosController;
import cl.duoc.tiendaonline.model.Pedidos;
import cl.duoc.tiendaonline.model.Productos;
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
            System.out.println("3. Quitar producto");  
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
                     
                case 2: { 
                    System.out.print("Lista de productos: "); 
                    productosView.mostrarProductos();
                    
                    System.out.print("Elegir productos: ");
		    int numero = parseIntSafe(sc.nextLine());
		    Productos p = productosController.buscarProducto(numero);

		    if (p == null) { 
		        System.out.println("No existe");
		        break;
		    }
 
		    System.out.print("Ingrese nombreCompleto: ");
		    String nombreCompleto = sc.nextLine().trim(); 
                    
		    System.out.print("Ingrese mail: ");
		    String mail = sc.nextLine().trim();
		    System.out.print("Cantidad: ");
		    int cantidad = parseIntSafe(sc.nextLine());

		    if (cantidad <= 0) {
		        System.out.println("Cantidad inválida");
		        break;
		    }

		    pedidosController.add(p, nombreCompleto, mail, cantidad);
		    System.out.println("Agregado");   
                    } 
                    
                case 3: { 
                    System.out.print("Lista de productos: "); 
                    productosView.mostrarProductos();
                    
                    System.out.print("Ingrese mail "); 
		    String mail = sc.nextLine();
		    pedidosController.remove(mail);
		    System.out.println("Quitado");
                }
            
                case 4:
                    pedidosView.show();
                    break;
                case 5:
                    descuentosView.configure();
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
 