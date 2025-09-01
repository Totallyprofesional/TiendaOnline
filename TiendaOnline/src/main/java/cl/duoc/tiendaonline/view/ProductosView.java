
package cl.duoc.tiendaonline.view;

import cl.duoc.tiendaonline.controller.ProductosController;
import cl.duoc.tiendaonline.model.Productos;
 
public class ProductosView {   
    
    private final ProductosController controller;

    public ProductosView(ProductosController controller) {
	this.controller = controller;
    }
   
    public void mostrarProducto() {
	System.out.println("\n Productos");

	for (Productos p : controller.list()) { 
	    System.out.println(" " + p.getNumero() + " - " + p.getModelo() + ", precio: $" + p.getPrecio());
	}
    }

}
  