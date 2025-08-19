/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline;
import cl.duoc.tiendaonline.managers.Balance;
import cl.duoc.tiendaonline.managers.DiscountManager;
import cl.duoc.tiendaonline.managers.InterfaceManager;
import cl.duoc.tiendaonline.managers.descuentos.DescuentoA;
import cl.duoc.tiendaonline.managers.descuentos.DescuentoN;
import cl.duoc.tiendaonline.models.Articulos;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
 
/**
 *
 * @author Pablo    
 */   

public class Menu { 
    private Scanner sc = new Scanner(System.in);
    private List<Articulos> zapatillas = new ArrayList<>();
    private DiscountManager manager; 
    private Balance balance;
    private int totalAdidas = 0;
    private int totalNike = 0;


    public Menu(DiscountManager manager, Balance balance) {
        this.manager = manager;
        this.balance = new Balance(0); 
        this.zapatillas = Articulos.MostrarSneakers(); 
    }

    public void MenuTienda (){
        int opcion = 0;

        do { 
            System.out.println("\n Bienvenido al Menu de Tienda Online");
            System.out.println("1. Ver artículos");
            System.out.println("2. Comprar artículos");
            System.out.println("3. Ver descuentos");
            System.out.println("4. Total fiscal"); 
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: "); 
 
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) { 
                case 1:
                    VerArticulos();
                    break;
                case 2: 
                    ComprarArticulos();
                    break; 
                case 3:
                    VerDescuentos(totalAdidas, totalNike);
                    break;
                case 4:
                    BalanceTotal();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 5);
       
    }
    
    public void VerArticulos (){ 
        System.out.println("\n Lista de Artículos:");
        System.out.println("");

        List<Articulos> zapatillas = Articulos.MostrarSneakers();
        for (Articulos articulos : zapatillas) {
            System.out.println(articulos.MostrarArticulo());
        } 
        
        System.out.println(""); 
        System.out.println("Presione enter para continuar...");
        sc.nextLine();                    
    }
    
    public void ComprarArticulos (){   
        
        VerArticulos();
        System.out.println("Seleccione artículo (1-10)");
        int elegir = sc.nextInt();
         
        Articulos valor = zapatillas.stream()
            .filter(a -> a.getNumero() == elegir)
            .findFirst()
            .orElse(null); 
         
        if (valor == null) {
            System.out.println("Artículo no encontrado.");
            return;
        }  
        
        int total = valor.getPrecio();  
        InterfaceManager im = new InterfaceManager();
        
        if (elegir == 2 || elegir == 10){
            DescuentoA descuentoA = new DescuentoA();
            total = descuentoA.run(total);
            totalAdidas += total;          
        } else if (elegir == 1 || elegir == 3){
            DescuentoN descuentoN = new DescuentoN(); 
            totalNike += total;    
        }  
        
        balance.SumarBalance(total);
        
        System.out.println("Precio final: " + total);
    } 
   
    public void VerDescuentos (int totalAdidas, int totalNike){ 
        InterfaceManager im = new InterfaceManager();     
        im.mostrarDescuentos(totalAdidas, totalNike); 
    }
     
    public void BalanceTotal (){ 
        System.out.println("Balance total: " + balance.getBalance());
    }
    
}
 