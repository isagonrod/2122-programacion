package Juegos.SopaDeLetras;

/* PRÁCTICA TEMA 10: CREAR TABLERO SOPA DE LETRAS
 * Sopa de Letras: Escoger un grupo de 8 palabras dentro de un tablero de letras de tamaño 15x15.
 * Pasos:
 *  1. Primer paso: elegir temática. Existen cinco temas distintos para elegir. Cada grupo de ocho palabras afines a un
 *      tema se guardarán en un fichero de texto, que servirán de entrada de datos para crear un tablero de juego.
 *      Cada alumno debe crear esos cinco ficheros de texto, con sus ocho palabras dentro.
 *  2. Segundo paso: Rellenar el tablero con las palabras del fichero correspondientes a la temática elegida por el
 *      usuario. La orientación de cada palabra podrá ser vertical u horizontal.
 *  3. Tercer paso: Rellenar el resto del tablero con letras escogidas al azar.
 *  4. Mostrar el tablero completo. Y guardarlo en un fichero de texto.
 *  5. Crear una clase MatrizJuego que contendrá el juego (char[][]) y sus operaciones.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SopaDeLetras_Tablero {
    public static void main (String[] args) {
        String tematica, contenidoFichero, palabra;
        MatrizJuego tablero = new MatrizJuego();

        tematica = getString("¿Qué temática quieres para jugar? Elige entre: animales, juegos, materiales, personajes o planetas.\n");
        contenidoFichero = leerFichero(tematica);
        tablero.rellenarTablero(contenidoFichero);
        System.out.println(tablero);
        tablero.guardarEnFichero();

        /*for (int i = 0; i < 8; i++) {
            palabra = getString("¿Qué palabra crees que has encontrado?");
            tablero.buscarPalabra(palabra);
        }*/
    }

    static String leerFichero(String nombreFichero) {
        BufferedReader in = null;
        String linea, contenido = "";

        try {
            in = new BufferedReader(new FileReader("src/Juegos/SopaDeLetras/" + nombreFichero + ".txt"));
            linea = in.readLine();
            while (linea != null) {
                contenido += linea + "\n";
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        return contenido;
    }

    static String getString (String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
