/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradortexto;

/**
 *
 * @author cosma_000
 */
public abstract class Decorador extends ComponenteTexto{
    protected ComponenteTexto t ;
    
    
    public Decorador(ComponenteTexto t){
    this.t = t;
    }
   
  
}
