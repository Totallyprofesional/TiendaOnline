/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers.command;

/**
 *
 * @author Home
 */
public class ComandoConcreto implements Command{
    private Receiver receiver;
    
    public ComandoConcreto (Receiver receiver){
        this.receiver = receiver;
    } 
     
    @Override
    public void ejecutar (){
        receiver.accion();
    }
      
}


