/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.tiendaonline.managers.decorator;

import cl.duoc.tiendaonline.managers.decorator.Component;

/**
 *
 * @author Home
 */
public abstract class Decorator implements Component {
    protected Component componente;     
    
    public Decorator (Component componente){
        this.componente = componente;
    }
     
    public void operacion (){
        componente.operacion();
    }
      
}
