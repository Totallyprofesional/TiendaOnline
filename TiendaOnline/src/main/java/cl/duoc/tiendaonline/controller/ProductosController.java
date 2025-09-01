
package cl.duoc.tiendaonline.controller;

import cl.duoc.tiendaonline.model.Productos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductosController {
    
    private final List<Productos> sneakers = new ArrayList<>();  

	public ProductosController() { 
            sneakers.add(new Productos(1, "Nike Air Force 1 Low", 132990));
            sneakers.add(new Productos(2, "Adidas Campus 00", 99990));
            sneakers.add(new Productos(3, "Jordan 1 Retro High OG", 357990));
            sneakers.add(new Productos(4, "New Balance 550", 109990));
            sneakers.add(new Productos(5, "Converse Chuck Taylor All Star", 29990));
            sneakers.add(new Productos(6, "Puma Suede Classic", 74990));
            sneakers.add(new Productos(7, "Nike Dunk Low", 92990));
            sneakers.add(new Productos(8, "Asics Gel-Kayano 14", 130000));
            sneakers.add(new Productos(9, "Reebok Club C 85", 29996));
            sneakers.add(new Productos(10, "Adidas Forum 84", 109990));
	}
 
	public List<Productos> list() {
            return Collections.unmodifiableList(sneakers);
	}

	public Productos buscarProducto(int numero) {
	    for (Productos p : sneakers)
		if (p.getNumero() == numero)
	            return p;
	    return null;
	}
    
}
