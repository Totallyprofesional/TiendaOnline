
package cl.duoc.tiendaonline.command;

import cl.duoc.tiendaonline.model.Pedidos;

public class RemovePedidoCommand implements Command {
    private final Pedidos pedidos;
    private final String mail; 
        
    public RemovePedidoCommand(Pedidos pedidos, String mail) {
        this.pedidos = pedidos;
        this.mail = mail;
    }

    @Override  
    public void ejecutar() { 
        
	pedidos.remove(mail);
    }
    
}
