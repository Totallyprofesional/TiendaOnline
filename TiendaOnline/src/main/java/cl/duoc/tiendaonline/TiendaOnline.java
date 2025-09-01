/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc.tiendaonline;

import cl.duoc.tiendaonline.managers.Balance;
import cl.duoc.tiendaonline.singleton.DiscountManager;

/**
 *
 * @author Home  
 */ 
public class TiendaOnline {
    public static DiscountManager manager; 
    public static Balance balance; 

    public static void main(String[] args) {
        Menu menu = new Menu(manager, balance); 
        menu.menuTienda();
    } 
     
} 
