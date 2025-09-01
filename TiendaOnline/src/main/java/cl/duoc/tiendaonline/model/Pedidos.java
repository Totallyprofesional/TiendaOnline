
package cl.duoc.tiendaonline.model;

import cl.duoc.tiendaonline.singleton.DiscountManager;
import java.util.Collection;
import java.util.LinkedHashMap; 
import java.util.Map; 
 
public class Pedidos { 
    private final Map<String, Usuarios> pedido = new LinkedHashMap<>();

	private String key(Productos p, String mail) {
 
	    return p.getNumero() + "|" + mail.toLowerCase();
	}
  
	public Collection<Usuarios> getPedido() {  

	    return pedido.values(); 
	}
  
	public void add(Productos p, String nombreCompleto, String mail, int cantidad) { 

	    pedido.compute(key(p, mail), (k, usuario) -> {
	        if (usuario == null)
	            return new Usuarios(p, nombreCompleto, mail, cantidad);
	            usuario.setCantidad(usuario.getCantidad() + cantidad);
		    return usuario; 
            });  
	}  

	public void remove(int numero, String mail) { 

		pedido.remove(numero + "|" + mail.toLowerCase());
	} 

	public double subtotal() {  
 
		double sum = 0;  

		for (Usuarios user : pedido.values())
			sum += user.getProductos().getPrecio() * user.getCantidad();

		return sum;
	}

	public double total() {

		DiscountManager dm = DiscountManager.getInstancia();
		double sum = 0;

		for (Usuarios user : pedido.values()) {

			double unidad = user.getProductos().getPrecio();
			double precioFinal = dm.aplicar(unidad, user.getProductos(), user.getMail());
			sum += precioFinal * user.getCantidad();
		}

		return sum;
	}
        
}
