/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Home
 */
public final class DiscountManager {  
    
    private final Map<String, String> descuentos = new HashMap<>();

    private DiscountManager() {
    }

    private static class Holder {
        private static final DiscountManager INSTANCE = new DiscountManager();
    }

    public static DiscountManager getInstancia() {
        return Holder.INSTANCE;
    }
    
    public String get(String key) {
        
        return descuentos.get(key);
    } 
    
    public void set(String key, String value) {
        
	descuentos.put(key, value);
    }
       
}
 