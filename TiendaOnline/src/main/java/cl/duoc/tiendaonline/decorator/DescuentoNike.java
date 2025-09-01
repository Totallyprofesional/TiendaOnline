
package cl.duoc.tiendaonline.decorator;

import cl.duoc.tiendaonline.model.Productos;

public class DescuentoNike extends PrecioDecorator {
      
    private final double porcentaje;

	public DescuentoNike (PrecioComponent inner, double porcentaje) {
	    super(inner);
	    this.porcentaje = porcentaje;
	}  
 
	@Override
	public double aplicar(int precio, Productos productos, String mail) {

		double base = super.aplicar(precio, productos, mail);

		if ("Nike".equalsIgnoreCase(productos.getModelo()))
			return base * (0.15 + porcentaje); 
 
		return base; 
	}
    
}
 