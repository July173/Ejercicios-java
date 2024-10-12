/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author SENA
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear tareas básicas
        Tarea tarea1 = new TareaBasica(1, "Tarea de Ejemplo 1");
        Tarea tarea2 = new TareaBasica(2, "Tarea de Ejemplo 2");

        // Crear un servidor con capacidad para 2 tareas
        servidor servidor1 = new servidor("Servidor 1", 2);

        // Hacer que el servidor procese una tarea
        servidor1.asignarYProcesarTarea(tarea1);

        // Hacer que el servidor procese dos tareas a la vez
        servidor1.asignarYProcesarTarea(tarea1, tarea2);
    }
}
