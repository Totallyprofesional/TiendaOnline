/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers;

/**
 *
 * @author Home
 */
public class Balance {
    private static Balance instancia;
    private int balance;
    private int total;

    public Balance(int balance, int total) {
        this.balance = balance;
        this.total = total;
    }

    public static Balance getInstancia() {
        if (instancia == null) {
            instancia = new Balance(0, 0);
        }
        return instancia;
    }
    
    public void SumarBalance() {
        this.balance += total; 
    }

    public int getBalance() {
        return balance;
    }

    public int getTotal() {
        return total;
    }
    
}
