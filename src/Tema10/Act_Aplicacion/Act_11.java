package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.11
 * Escribe un programa que solicite al usuario el nombre de un fichero de texto y muestre su contenido en pantalla.
 * Si no se proporciona ningún nombre de fichero, la aplicación utilizará por defecto prueba.txt
 */

import Utilidades.Teclado;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Act_11 {
    public static void main (String[] args) {
        String fichero = "";
        String nombreFichero = Teclado.getString("Nombre del fichero: ");
        BufferedReader in = null;

        if (nombreFichero == "" || nombreFichero == null) {
            nombreFichero = "prueba.txt";
        }

        try {
            in = new BufferedReader(new FileReader("archivos_txt/" + nombreFichero));
            String linea = in.readLine();
            while (linea != null) {
                fichero += linea + '\n';
                linea = in.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + ". Usando prueba.txt.");
            try {
                in = new BufferedReader(new FileReader("archivos_txt/prueba.txt"));
                String linea = in.readLine();
                while (linea != null) {
                    fichero += linea + '\n';
                    linea = in.readLine();
                }
            } catch (IOException exIn) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(fichero);
    }
}
