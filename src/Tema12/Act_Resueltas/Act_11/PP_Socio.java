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

import java.io.*;
import java.util.Comparator;
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
                case 2 -> socios.remove(new Socio(Teclado.getString("DNI: ")));
                case 3 -> {
                    String dni = Teclado.getString("DNI: ");
                    socios.remove(new Socio(dni));
                    alta(socios,dni);
                }
                case 4 -> System.out.println(socios);
                case 5 -> {
                    Comparator<Socio> c = new Comparator<>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o2.antiguedad() - o1.antiguedad();
                        }
                    };
                    Set<Socio> s = new TreeSet<>(c);
                    s.addAll(socios);
                    System.out.println(s);
                }
                case 6 -> {
                    guardarFichero(socios);
                    System.out.println("¡Adiós!");
                }
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

    static void guardarFichero(Set<Socio> conjunto) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema12/Act_Resueltas/Act_11/socios.dat"))) {
            out.writeObject(conjunto);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
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
