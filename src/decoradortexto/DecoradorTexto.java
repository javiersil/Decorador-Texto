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
public class DecoradorTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Texto uno");
        ComponenteTexto t = new Texto("hola");
         System.out.println("Original "+t.imprimir());
        t = new TextoMayuscula(t);
        
        System.out.println("Mayuscula: "+t.imprimir());
        
        
        System.out.println("Texto dos");
        ComponenteTexto t2 = new Texto("hola");
        System.out.println("Original "+t2.imprimir());
        t2 = new TextoEncriptado(t2);        
        System.out.println("Encriptado "+t2.imprimir());
        t2 = new TextoMayuscula(t2);        
        System.out.println("Mayuscula: "+t2.imprimir());
        
    }
    
}
