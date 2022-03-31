package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.16
 * Implementa una aplicación que gestione una lista de nombres ordenada por orden alfabético.
 * Al arrancar se leerá de un fichero los nombres insertados anteriormente y se pedirán nombres nuevos hasta que se
 * introduzca la cadena "fin".
 * Cada nombre que se introduzca deberá añadirse a los que ya había, de forma que la lista permanezca ordenada.
 * Al terminar, se guardará en el fichero actualizada.
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Arrays;

public class Act_16 {
    public static void main (String[] args) {
        //String[] nombres = {"Alba", "Ana", "Carlos", "Domingo", "Juanjo"};
        //escribirFichero(nombres);
        String[] nombres = new String[0];
        nombres = leerFichero(nombres);
        nombres = introducirNombres(nombres);
        escribirFichero(nombres);
    }

    static void escribirFichero(String[] tabla) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/nombresOrdenados.dat"))) {
            for (int i = 0; i < tabla.length; i++) {
                out.writeObject(tabla[i]);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static String[] leerFichero(String[] aux) {
        String linea;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/nombresOrdenados.dat"))) {
            while (true) {
                linea = (String) in.readObject();
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = linea;
            }
        }
        catch (EOFException ex) {
            System.out.println("Fin de fichero");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        return aux;
    }

    static String[] introducirNombres(String[] tabla) {
        String[] aux = tabla;
        String nombreNuevo = Teclado.getString("Nombres nuevo: ");
        int posicion;

        while (nombreNuevo.compareToIgnoreCase("fin") != 0) {
            posicion = Arrays.binarySearch(aux, nombreNuevo);
            if (posicion < 0) {
                posicion = Math.abs(posicion) - 1;
            }

            aux = Arrays.copyOf(aux, aux.length + 1);
            System.arraycopy(aux, 0, aux, 0, posicion);
            System.arraycopy(aux, posicion, aux, posicion + 1, aux.length - posicion - 1);

            aux[posicion] = nombreNuevo;
            nombreNuevo = Teclado.getString("Nombres nuevo: ");
        }
        tabla = aux;

        return tabla;
    }
}
