/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc.tiendaonline;

import cl.duoc.tiendaonline.managers.DiscountManager;

/**
 *
 * @author Home 
 */ 
public class TiendaOnline {
    public static DiscountManager manager; 

    public static void main(String[] args) {
        Menu menu = new Menu(manager); 
        menu.MenuTienda();
    }
    
} 
