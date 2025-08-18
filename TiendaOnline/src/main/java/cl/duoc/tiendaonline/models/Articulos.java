/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.models;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class Articulos {
    private int numero;
    private String modelo;
    private int precio;

    public Articulos(int numero, String modelo, int precio) {
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
       
    public String MostrarArticulo() {
        return numero + ". " + modelo + " = $" + precio;
    }
     
    public static List<Articulos> MostrarSneakers() {
        List<Articulos> zapatillas = new ArrayList<>();
        try (
            FileReader reader = new FileReader("sneakers.csv");
            CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextLine; 
            csvReader.readNext(); 
            
            while ((nextLine = csvReader.readNext()) != null) {
                int numero = Integer.parseInt(nextLine[0]);
                String modelo = nextLine[1];
                int precio = Integer.parseInt(nextLine[2]);
                
                Articulos articulos = new Articulos(numero, modelo, precio); 
                zapatillas.add(articulos);
            }
        } catch (Exception e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
        return zapatillas;
    }
    
    public static List<Articulos> ElegirSneakers() {
        List<Articulos> zapatillas = Articulos.MostrarSneakers();
        return zapatillas;
    }
    
}
