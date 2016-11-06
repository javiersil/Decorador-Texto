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
public class TextoEncriptado extends Decorador
{
    
    public TextoEncriptado(ComponenteTexto t) {
        super(t);
    }
    
    
   

    @Override
    public String imprimir() {
      
         char array[]=super.t.imprimir().toCharArray();
        
        for(int i=0;i<array.length;i++){
            array[i]=(char)(array[i]+(char)5);
}
        return  String.valueOf(array); 
        
        
    
             
             
             
              
    }
    
}
