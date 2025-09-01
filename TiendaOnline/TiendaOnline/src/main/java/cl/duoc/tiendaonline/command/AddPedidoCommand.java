
package cl.duoc.tiendaonline.command;

import cl.duoc.tiendaonline.model.Pedidos; 
import cl.duoc.tiendaonline.model.Productos;
 
public class AddPedidoCommand implements Command{ 
    private final Pedidos pedido; 
    private final Productos productos; 
    private final String nombreCompleto;
    private final String mail;
    private final int cantidad;

    public AddPedidoCommand(Pedidos pedido, Productos productos, String nombreCompleto, String mail, int cantidad) {
        this.pedido = pedido;
        this.productos = productos;
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
        this.cantidad = cantidad;
    }
 
    @Override  
    public void ejecutar (){ 
        
        pedido.add(productos, nombreCompleto, mail, cantidad);
    }
      
}


 