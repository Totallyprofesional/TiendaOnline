/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers.decorator;

import cl.duoc.tiendaonline.managers.DiscountManager;
import cl.duoc.tiendaonline.managers.descuentos.DescuentoA;
import cl.duoc.tiendaonline.managers.descuentos.DescuentoN;


/** 
 *
 * @author Home
 */

public class ComponenteConcreto implements Component {
      
    private DescuentoA adidas = new DescuentoA(); 
    private DescuentoN nike = new DescuentoN();

    @Override
    public void operacion() {
        int totalAdidas = 100;
        int totalNike = 200;
        mostrarDescuentos(totalAdidas, totalNike);
    }

    private void mostrarDescuentos(int totalAdidas, int totalNike) {  
        totalAdidas = adidas.run(totalAdidas);  
        totalNike = nike.run(totalNike);      
    
        DiscountManager dm = DiscountManager.getInstancia();
    
        System.out.println("");
        System.out.println("=== Descuentos aplicados ===");
        System.out.println("Descuento A (Adidas): " + dm.get("A"));
        System.out.println("Descuento N (Nike): " + dm.get("N"));
        System.out.println("============================");
    }
}