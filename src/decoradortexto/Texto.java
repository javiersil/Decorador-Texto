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
public class Texto extends ComponenteTexto{
   
   public Texto(String texto){
    super.leerTexto(texto);
   }
   
    
    public String imprimir() {
       return texto; }
    
}
