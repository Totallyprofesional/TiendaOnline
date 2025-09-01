
package cl.duoc.tiendaonline.singleton;
 
import cl.duoc.tiendaonline.decorator.PrecioBase;
import cl.duoc.tiendaonline.decorator.PrecioComponent;
import cl.duoc.tiendaonline.model.Productos;

public final class DiscountManager {   
     
    private PrecioComponent component = new PrecioBase();
 
    private DiscountManager() {  
    }  

    private static class Holder {
        private static final DiscountManager INSTANCE = new DiscountManager();
    }

    public static DiscountManager getInstancia() {
        return Holder.INSTANCE;
    }
    
    public void setComponent(PrecioComponent pc) {

	this.component = pc == null ? new PrecioBase() : pc;
    } 
    
    public double aplicar(double precio, Productos producto, String mail) {

	return component.aplicar((int)precio, producto, mail);
    }
        
}
 