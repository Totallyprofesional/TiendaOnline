
package cl.duoc.tiendaonline.view;

import cl.duoc.tiendaonline.controller.PedidosController;
import cl.duoc.tiendaonline.model.Pedidos;
import cl.duoc.tiendaonline.model.Usuarios;
import cl.duoc.tiendaonline.singleton.DiscountManager;

public class PedidosView {

    private final PedidosController controller;

    public PedidosView(PedidosController controller) {
        this.controller = controller;
    }

    public void show() { 
 
	Pedidos p = controller.getPedidos();

	if (p.getPedidos().isEmpty()) {
	    System.out.println("\n No hay entradas en la reserva");
	    return; 
	}

	System.out.println("\n Reserva");
 
	for (Usuarios user : p.getPedidos()) {

	    double unit = user.getProductos().getPrecio();
	    double priced = DiscountManager.getInstancia().aplicar(unit, user.getProductos(), user.getMail());
	    System.out.println(" " + user.getProductos().getNumero() + " - " + user.getProductos().getModelo() 
	    + " x" + user.getCantidad() + ", precio unitario: $" + unit + ", precio final: $" + priced);
	}

	System.out.println("Subtotal $" + p.subtotal());
	System.out.println("Total $" + p.total());
    }
     
}
