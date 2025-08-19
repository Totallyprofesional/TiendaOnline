/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers.descuentos;

import cl.duoc.tiendaonline.managers.DiscountManager;

/**
 *
 * @author Home
 */
public class DescuentoA {
    private final DiscountManager descuento = DiscountManager.getInstancia();

    public int run(int precio) {
        
        precio = (int)(precio * 0.9);
        descuento.set("A", "20%");

        return precio;
    }
}
    

