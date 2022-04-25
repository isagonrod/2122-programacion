package Tema12.Act_Resueltas.Act_11;

/* ACTIVIDAD RESUELTA 12.11
 * Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que deberán incluir el método equals(),
 * la interfaz Comparable basada en el dni y el método antiguedad().
 * Implementar un programa que gestione los socios de un club guardando los datos en el fichero socios.dat.
 * Al arrancar la aplicación, se leen los datos del fichero y se abre un menú con las opciones:
 *      1. Alta
 *      2. Baja
 *      3. Modificación
 *      4. Listado por DNI
 *      5. Listado por antigüedad
 *      6. Salir
 * Al salir de la aplicación se guardan en el fichero los datos actualizados.
 */

import Utilidades.Teclado;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Set;
import java.util.TreeSet;

public class PP_Socio {
    public static void main(String[] args) {
        Set<Socio> socios = new TreeSet<>();
        socios = leerFichero();
        int opcion;

        do {
            menu();
            opcion = Teclado.leerOpcion(1, 6);
            switch (opcion) {
                case 1 -> alta(socios, Teclado.getString("DNI: "));
            }
        } while (opcion != 6);
    }

    public static Set leerFichero() {
        Set<Socio> conjunto = new TreeSet<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tema12/Act_Resueltas/Act_11/socios.dat"))) {
            conjunto = (TreeSet<Socio>)in.readObject();
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return conjunto;
    }

    public static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificación");
        System.out.println("4. Listado por DNI");
        System.out.println("5. Listado por antigüedad");
        System.out.println("6. Salir");
    }

    public static boolean alta(Set<Socio> socios, String dni) {
        String nombre = Teclado.getString("Nombre: ");
        String fechaAlta = Teclado.getString("Fecha de alta: ");
        Socio nuevo = new Socio(dni, nombre, fechaAlta);
        return socios.add(nuevo);
    }
}
