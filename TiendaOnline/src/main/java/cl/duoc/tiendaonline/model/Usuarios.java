
package cl.duoc.tiendaonline.model;

import java.util.ArrayList;
  
public class Usuarios { 
    private final Productos productos;
    private String nombreCompleto;  
    private String mail;  
    private int cantidad;

    public Usuarios(Productos productos, String nombreCompleto, String mail, int cantidad) {
        this.productos = productos;
        this.nombreCompleto = nombreCompleto; 
        this.mail = mail;
        this.cantidad = cantidad;
    }

    public Productos getProductos() {
        return productos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getMail() {
        return mail;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
 