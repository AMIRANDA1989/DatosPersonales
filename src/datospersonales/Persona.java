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
public class Persona {
    private String nombre;
    private String apellido;
    private String dui;
    private int edad;
    private String fechaNac;
    
    public Persona(String nombre, String apellido, String dui, int edad, String fechaNac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dui = dui;
        this.fechaNac = fechaNac;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellido: "+ this.apellido);
        System.out.println("edad: "+ this.edad);
        System.out.println("dui: "+ this.dui);
        System.out.println("fecha de nacimiento: "+ this.fechaNac);
        
    }
}
