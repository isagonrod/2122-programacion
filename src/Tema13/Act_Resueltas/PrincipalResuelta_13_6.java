package Tema13.Act_Resueltas;

/* ACTIVIDAD RESUELTA 13.6
 * Implementar el método estático "static <T> paraCada(T[] tabla, Consumer<T> c)" similar a forEach (que no existe para
 * tablas). Este método ejecuta en cada elemento de la tabla la acción implementada en el objeto Consumer.
 * Usarlo para mostrar por pantalla los nombres y edades de los Clientes de una tabla.
 */

import Tema13.Act_Resueltas.Act_1.Cliente;

import java.util.function.Consumer;

public class PrincipalResuelta_13_6 {
    public static void main(String[] args) {
        Cliente[] grupoClientes = {
                new Cliente("111", "Marta", "12/02/2000"),
                new Cliente("115", "Jorge", "16/03/1999"),
                new Cliente("112", "Carlos", "01/10/2002"),
                new Cliente("211", "Ana", "07/12/2001"),
                new Cliente("666", "Isa", "10/12/1985")
        };
        paraCada(grupoClientes, a -> System.out.println("dni: " + a.dni + "\tedad: " + a.edad()));
    }

    static <T> void paraCada(T[] tabla, Consumer<T> c) {
        for (T t : tabla) {
            c.accept(t);
        }
    }
}
