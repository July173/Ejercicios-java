/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Paula
 */
public class BibliotecaEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     List<Libro> biblioteca = new ArrayList<>();
     try( Scanner scanner= new Scanner(System.in)){
      while (true){
        System.out.println("Biblioteca");
         
        System.out.println("Ingrese 1 para añadir libro ");
        System.out.println("Ingresa 2 para ver la lista de los libros disponibles en la biblioteca");
        System.out.println("Ingresa 3 para buscar libro por titulo");
        System.out.println("Ingresa 4 para salir del programa");
        int opcion = scanner.nextInt();
        scanner.nextLine();
       
       
        switch (opcion) {
            case 1:
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Año de publicación: ");
                        int año = scanner.nextInt();
                        biblioteca.add(new Libro(titulo, autor, año));
                        System.out.println("Libro agregado correctamente.\n");
                        break;
                    case 2:
                        System.out.println("Lista de libros:");
                        for (Libro libro : biblioteca) {
                            System.out.println(libro.titulo + " (" + libro.autor + ", " + libro.Age + ")");
                        }
                        break;
                    case 3:
                        System.out.print("Buscar por título: ");
                        String busqueda = scanner.nextLine();
                        System.out.println("Resultados:");
                        for (Libro libro : biblioteca) {
                            if (libro.titulo.toLowerCase().contains(busqueda.toLowerCase())) {
                                System.out.println(libro.titulo + " (" + libro.autor + ", " + libro.Age + ")");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
                 
            }
        }
    }
}
