/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author SENA
 */
public class TareaSegundoPlano extends Tarea  {

    public TareaSegundoPlano(int prioridad, String nombre) {
        super(prioridad, nombre);
    }
    
    @Override
    public void procesar(){
        System.out.println("Procesando tarea de segundo plano:"+ nombre);};
}
