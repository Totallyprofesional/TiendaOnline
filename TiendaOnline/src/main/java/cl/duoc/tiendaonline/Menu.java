
package cl.duoc.tiendaonline;

import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
 
public class Menu {   
    private Scanner sc = new Scanner(System.in);
    private List<Productos> zapatillas = new ArrayList<>();
    private DiscountManager manager; 
    private Balance balance;
    private int totalAdidas = 0;
    private int totalNike = 0; 


    public Menu(DiscountManager manager, Balance balance) {
        this.manager = manager;
        this.balance = new Balance(0); 
        this.zapatillas = Productos.mostrarSneakers(); 
    }

    public void menuTienda (){
        int opcion = 0;

        do { 
            System.out.println("\n Bienvenido al Menu de Tienda Online");
            System.out.println("1. Ver productos");
            System.out.println("1. Ingresar usuario");
            System.out.println("1. Registrar usuario"); 
            System.out.println("1. Ver carrito");
            System.out.println("1. Realizar pedido");
            System.out.println("2. Comprar artículos");
            System.out.println("3. Ver descuentos");
            System.out.println("4. Total fiscal"); 
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: "); 
 
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) { 
                case 1:
                    verArticulos();
                    break; 
                case 2: 
                    comprarArticulos();
                    break; 
                case 3:
                    verDescuentos(totalAdidas, totalNike);
                    break;
                case 4:
                    balanceTotal();
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
    
    public void verArticulos (){ 
        System.out.println("\n Lista de Artículos:");
        System.out.println("");

        List<Productos> zapatillas = Productos.mostrarSneakers();
        for (Productos articulos : zapatillas) {
            System.out.println(articulos.mostrarArticulo());
        } 
        
        System.out.println(""); 
        System.out.println("Presione enter para continuar...");
        sc.nextLine();                    
    }
    
    public void comprarArticulos (){   
        
        verArticulos();
        System.out.println("Seleccione artículo (1-10)");
        int elegir = sc.nextInt();
         
        Productos valor = zapatillas.stream()
            .filter(a -> a.getNumero() == elegir)
            .findFirst()
            .orElse(null); 
          
        if (valor == null) { 
            System.out.println("Artículo no encontrado.");
            return;
        }  
        
        int total = valor.getPrecio();  
        InterfazDescuentos ds = new InterfazDescuentos();
        
        if (elegir == 2 || elegir == 10){
            DescuentoA descuentoA = new DescuentoA();
            total = descuentoA.run(total);
            totalAdidas += total;          
        } else if (elegir == 1 || elegir == 3){
            DescuentoN descuentoN = new DescuentoN(); 
            totalNike += total;    
        }   
        
        balance.sumarBalance(total);
        
        System.out.println("Precio final: " + total);
    } 
   
    public void verDescuentos (int totalAdidas, int totalNike){ 
        InterfazDescuentos ds = new InterfazDescuentos();     
        ds.mostrarDescuentos(totalAdidas, totalNike); 
    }
     
    public void balanceTotal (){ 
        System.out.println("Balance total: " + balance.getBalance());
    }
    
}
 