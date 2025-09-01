
package cl.duoc.tiendaonline.decorator;

import cl.duoc.tiendaonline.model.Productos;

public interface PrecioComponent {

	double aplicar(int precio, Productos productos, String mail); 
} 
 

