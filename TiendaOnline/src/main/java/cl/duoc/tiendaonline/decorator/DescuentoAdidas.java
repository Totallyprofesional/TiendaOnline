
package cl.duoc.tiendaonline.decorator;

import cl.duoc.tiendaonline.model.Productos;

public class DescuentoAdidas extends PrecioDecorator {
   
    private final double porcentaje;  
 
	public DescuentoAdidas (PrecioComponent inner, double porcentaje) {
	    super(inner);
	    this.porcentaje = porcentaje; 
   	}  

	@Override
	public double aplicar(int precio, Productos productos, String mail) {

		double base = super.aplicar(precio, productos, mail);

		if ("Adidas".equalsIgnoreCase(productos.getModelo()))
			return base * (0.10 + porcentaje); 
 
		return base; 
	}
    
}
 