/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author SENA
 */
public abstract class Tarea {
    
    protected int prioridad;
    protected String nombre;
    
    // Constructor
     public Tarea(int prioridad, String nombre) {
        this.prioridad = prioridad;
        this.nombre = nombre;
    }
     
      public String getNombre() {
        return nombre;
    }
      
    public abstract void procesar();
    
}
