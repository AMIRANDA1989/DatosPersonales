/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

/**
 *
 * @author allan
 */
public class DatosPersonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona allan = new Persona("Allan", "Miranda", "04155230-9",28,"18/09/1989");
        
        allan.mostrarInfo();
    }
    
}
