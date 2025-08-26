/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers;

import cl.duoc.tiendaonline.managers.command.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class Receiver {
    public class Invoker {
        private List <Command> comandos = new ArrayList <>();
        
        public void agregarComando (Command comando){
            comandos.add (comando);
        }
        
        public void ejecutarComandos (){
            for (Command comando : comandos) {
                comando.ejecutar();
            }
        }       
    }
     
}
