
package cl.duoc.tiendaonline.command;

import cl.duoc.tiendaonline.decorator.PrecioComponent;
import cl.duoc.tiendaonline.singleton.DiscountManager;

public class ReceiverDescuentosCommand implements Command {

    private final PrecioComponent pipeline; 

    public ReceiverDescuentosCommand(PrecioComponent pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public void ejecutar() {

	DiscountManager.getInstancia().setComponent(pipeline);
    }
}
