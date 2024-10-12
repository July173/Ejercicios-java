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
    
    // Constructor
    public servidor(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.cargaActual = 0;  // Inicialmente no hay carga
    }
    
     // Método para procesar una tarea
    public void asignarYProcesarTarea(Tarea tarea) {
        if (cargaActual < capacidadMaxima) {
            System.out.println(nombre + " está procesando la tarea: " + tarea.getNombre());
            tarea.procesar(); // Procesa la tarea
            cargaActual++; // Incrementa la carga del servidor
        } else {
            System.out.println("El servidor " + nombre + " está lleno. No puede procesar más tareas.");
        }
    }

    // Sobrecarga: Método para procesar dos tareas
    public void asignarYProcesarTarea(Tarea tarea1, Tarea tarea2) {
        if (cargaActual + 2 <= capacidadMaxima) { // Verifica si hay espacio para dos tareas
            System.out.println(nombre + " está procesando las tareas: " + tarea1.getNombre() + " y " + tarea2.getNombre());
            tarea1.procesar(); // Procesa la primera tarea
            tarea2.procesar(); // Procesa la segunda tarea
            cargaActual += 2; // Incrementa la carga del servidor por dos
        } else {
            System.out.println("El servidor " + nombre + " no puede procesar más tareas.");
        }
    }

}
