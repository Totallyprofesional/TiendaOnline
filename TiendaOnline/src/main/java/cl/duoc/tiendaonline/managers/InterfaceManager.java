/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers;

import cl.duoc.tiendaonline.managers.descuentos.DescuentoA;
import cl.duoc.tiendaonline.managers.descuentos.DescuentoN;

/**
 *
 * @author Home
 */
public class InterfaceManager {
    
    private final DescuentoA adidas = new DescuentoA();
    private final DescuentoN nike = new DescuentoN();

    public void mostrarDescuentos() { 
        DiscountManager dm = DiscountManager.getInstancia();

        String descuentoA = dm.get("A");
        String descuentoN = dm.get("N");
 
        System.out.println("=== Descuentos aplicados ===");
        System.out.println("Descuento A (Adidas): " + descuentoA);
        System.out.println("Descuento N (Nike): " + descuentoN);
        System.out.println("============================");
    }
}
 