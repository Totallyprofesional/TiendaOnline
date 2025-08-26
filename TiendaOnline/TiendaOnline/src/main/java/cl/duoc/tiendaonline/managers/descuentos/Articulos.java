/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers.descuentos;

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
       
    public String mostrarArticulo() {
        return numero + ". " + modelo + " = $" + precio;
    }
     
    public static List<Articulos> mostrarSneakers() {
        List<Articulos> zapatillas = new ArrayList<>();
        try (
            FileReader reader = new FileReader("sneakers.csv");
            CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextLine; 
            csvReader.readNext(); // Saltar encabezado (solo si existe)

        while ((nextLine = csvReader.readNext()) != null) {
            if (nextLine.length < 3) {
                System.out.println("Fila inválida en CSV: " + String.join(",", nextLine));
                continue;
            }

            try {
                int numero = Integer.parseInt(nextLine[0].trim());
                String modelo = nextLine[1].trim();
                int precio = Integer.parseInt(nextLine[2].trim());

                Articulos articulos = new Articulos(numero, modelo, precio); 
                zapatillas.add(articulos);
            } catch (NumberFormatException e) {
                    System.out.println("Error al parsear fila: " + String.join(",", nextLine));
                }
            }
        } catch (Exception e) {
            System.out.println("Error de lectura CSV: " + e.getMessage());
        }
        return zapatillas;
    }
    
    public static List<Articulos> elegirSneakers() {
        List<Articulos> zapatillas = Articulos.mostrarSneakers();
        return zapatillas;
    }
    
}
