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
public class TextoMayuscula extends Decorador {
    
    public TextoMayuscula(ComponenteTexto t) {
        super(t);
    }

    @Override
    public String imprimir() {
     
    return super.t.imprimir().toUpperCase();
    }
   
    
}
