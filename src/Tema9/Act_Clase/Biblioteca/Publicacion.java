package Tema9.Act_Clase.Biblioteca;

/* Escribir un programa para una biblioteca que contenga libros y revistas.
 * Las características comunes para libros y revistas son: código, título y año de publicación.
 *
 * Al crear una revista o un libro se especificarán estos tres valores, el código será un entero único para cada
 * publicación y será asignado automáticamente.
 *
 * Los libros tienen además un atributo prestado. Al ser creado, no está prestado (false).
 *
 * Cada revista tiene además un número que será pasado como parámetro al ser creada la revista.
 *
 * Crear una interfaz prestable con los métodos prestar, devolver y prestado.
 *      - void prestar();
 *      - void devolver();
 *      - boolean prestado();
 *
 * Implementar una superclase Publicacion.
 *
 * Se pide realizar un proyecto que permita:
 *      1. Alta libro
 *      2. Alta revista
 *      3. Prestar libro
 *      4. Devolver libro
 *      5. Listado completo
 *      6. Listado de revistas (mostrando el número de revistas en total)
 *      7. Listado de libros (mostrando si están o no prestados)
 *      8. Salir
 */

import Utilidades.Teclado;

public class Publicacion {
    static int numPublicacion = 1;
    int codigo; // TODO : asignar de forma automática
    private String titulo;
    private int añoPublicacion;

    public Publicacion(String titulo, int añoPublicacion) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public void pedirDatosPublicacion() {
        this.titulo = Teclado.getString("Título: ");
        this.añoPublicacion = Teclado.getNumber("Año de publicación: ");
    }
}
