
package cl.duoc.tiendaonline.command;

import cl.duoc.tiendaonline.model.Pedidos;

public class RemovePedidoCommand implements Command {
    private final Pedidos pedido;
    private final int numero;
    private final String mail; 
        
    public RemovePedidoCommand(Pedidos pedido, int numero, String mail) {
        this.pedido = pedido;
        this.numero = numero;
        this.mail = mail;
    }

    @Override
    public void ejecutar() { 
        
	pedido.remove(numero, mail);
    }
    
}
