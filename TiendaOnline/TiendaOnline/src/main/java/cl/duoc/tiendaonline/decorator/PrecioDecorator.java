
package cl.duoc.tiendaonline.decorator;

import cl.duoc.tiendaonline.decorator.PrecioComponent;
import cl.duoc.tiendaonline.model.Productos;

public abstract class PrecioDecorator implements PrecioComponent {
    protected final PrecioComponent interno;     
 
    protected PrecioDecorator(PrecioComponent interno) {
        this.interno = interno;
    } 

    @Override
    public double aplicar(int precio, Productos productos, String mail) {

	return interno.aplicar(precio, productos, mail);
    }
      
}
