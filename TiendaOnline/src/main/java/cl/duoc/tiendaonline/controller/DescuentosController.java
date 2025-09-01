
package cl.duoc.tiendaonline.controller;

import cl.duoc.tiendaonline.command.ReceiverDescuentosCommand;
import cl.duoc.tiendaonline.decorator.DescuentoAdidas;
import cl.duoc.tiendaonline.decorator.DescuentoNike;
import cl.duoc.tiendaonline.decorator.PrecioBase;
import cl.duoc.tiendaonline.decorator.PrecioComponent;
   
public class DescuentosController {  
    public void setProceso1(boolean descuentos) {
        PrecioComponent pipe = new PrecioBase();
 
        if (descuentos) {
            pipe = new DescuentoNike(new DescuentoAdidas(pipe, 0.10), 0.15);
        }

        new ReceiverDescuentosCommand(pipe).ejecutar();
    }        

    public void setProceso2(boolean descuentos) {
        PrecioComponent pipe = new PrecioBase(); 

        if (descuentos) {
            pipe = new DescuentoAdidas(new DescuentoNike(pipe, 0.15), 0.10);
        }

        new ReceiverDescuentosCommand(pipe).ejecutar();
    }     
    
    public void clear() { 
	new ReceiverDescuentosCommand (new PrecioBase()).ejecutar();
    } 
     
}   
 