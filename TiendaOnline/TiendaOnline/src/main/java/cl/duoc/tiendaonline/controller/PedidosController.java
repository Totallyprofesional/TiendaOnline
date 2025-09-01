
package cl.duoc.tiendaonline.controller;

import cl.duoc.tiendaonline.command.AddPedidoCommand;
import cl.duoc.tiendaonline.command.RemovePedidoCommand;
import cl.duoc.tiendaonline.model.Pedidos;
import cl.duoc.tiendaonline.model.Productos;

public class PedidosController {   
    
    private final Pedidos pedidos; 
 
        public PedidosController(Pedidos pedidos) {
            this.pedidos = pedidos;
        } 
	
	public void add(Productos productos, String nombreCompleto, String mail, int cantidad) {
            
            new AddPedidoCommand(pedidos, productos, nombreCompleto, mail, cantidad).ejecutar();
        }

	public void remove(int numero, String mail) {

		new RemovePedidoCommand(pedidos, numero, mail).ejecutar();
	}

        public Pedidos getPedidos() {   
            return pedidos;
        }

}
