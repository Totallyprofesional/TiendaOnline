
package cl.duoc.tiendaonline.decorator;

import cl.duoc.tiendaonline.model.Productos;

public class PrecioBase implements PrecioComponent {

    @Override
    public double aplicar(int precio, Productos productos, String mail) {
        
    return precio; 
    }
     
}