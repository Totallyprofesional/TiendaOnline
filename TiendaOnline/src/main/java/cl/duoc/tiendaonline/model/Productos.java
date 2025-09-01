
package cl.duoc.tiendaonline.model;

import java.util.ArrayList;
import java.util.List; 
 
public class Productos { 
    private int numero; 
    private String modelo;
    private int precio;

    public Productos(int numero, String modelo, int precio) {
        this.numero = numero;
        this.modelo = modelo;
        this.precio = precio;   
    } 
  
    public int getNumero() { 
        return numero;
    }
 
    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }
    
}
