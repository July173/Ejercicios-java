/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author SENA
 */
public class TareaBasica extends Tarea {

    public TareaBasica(int prioridad, String nombre) {
        super(prioridad, nombre);
    }
    
    @Override
    public void procesar(){
        System.out.println("Procesando tarea basica "+ nombre);};
}
