
package cl.duoc.tiendaonline.controller;

import cl.duoc.tiendaonline.command.AddPedidoCommand;
import cl.duoc.tiendaonline.command.RemovePedidoCommand;
import cl.duoc.tiendaonline.model.Pedidos;
import cl.duoc.tiendaonline.model.Productos;

public class PedidosController {   
    
    private final Pedidos pedido;
 
        public PedidosController(Pedidos pedido) {
            this.pedido = pedido;
        } 
	
	public void add(Productos productos, String nombreCompleto, String mail, int cantidad) {
            
            new AddPedidoCommand(pedido, productos, nombreCompleto, mail, cantidad).ejecutar();
        }

	public void remove(int numero, String mail) {

		new RemovePedidoCommand(pedido, numero, mail).ejecutar();
	}

        public Pedidos getPedido() {   
            return pedido;
        }

}
