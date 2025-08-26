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
    private int balance;

    public Balance(int balance) {
        this.balance = balance;
    }

    public void sumarBalance(int total){
        this.balance += total;
    }

    public int getBalance() {
        return balance;
    }
    
}
