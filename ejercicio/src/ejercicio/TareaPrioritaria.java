/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author SENA
 */
public class TareaPrioritaria extends Tarea {

   public TareaPrioritaria(int prioridad, String nombre) {
        super(prioridad, nombre);
    }
   
    @Override
    public void procesar(){
        System.out.println("Procesar  tarea prioritaria:"+nombre);};
}
