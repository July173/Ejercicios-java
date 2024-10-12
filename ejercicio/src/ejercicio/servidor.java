/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author SENA
 */
public class servidor {
    public String nombre;
    public int cargaActual;
    public int capacidadMaxima;
    
    public void asignarTarea(Tarea tarea){
        if (cargaActual < capacidadMaxima) {
           
            tarea.procesar();
            cargaActual++;
        } else {
            System.out.println("El servidor " + nombre + " está sobrecargado.");
        }
    };
    
      public void balancearCarga() {
          
      }
}
