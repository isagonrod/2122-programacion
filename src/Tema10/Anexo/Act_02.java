package Tema10.Anexo;

/* ANEXO - ACTIVIDAD 2
 * Encontrar líneas palíndromas en un archivo de texto.
 * Visualizar un mensaje con cada una de ellas.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_02 {
    public static void main (String[] args) {
        buscarPalidromo(leerFichero());
    }

    static Lista leerFichero() {
        BufferedReader in = null;
        Lista contenido = new Lista();
        String linea;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/fichero.txt"));
            linea = in.readLine();
            while (linea != null) {
                contenido.encolar(linea);
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

    static void buscarPalidromo(Lista contenido) {
        String linea, lineaSinEspacios, lineaInvertida;

        while (contenido.getLength() > 0) {
            linea = (String)contenido.desencolar();

            lineaSinEspacios = linea.replaceAll(" ", "");
            lineaInvertida = invertirCadena(lineaSinEspacios);

            if (lineaSinEspacios.compareToIgnoreCase(lineaInvertida) == 0) {
                System.out.println(linea);
            }
        }
    }

    static String invertirCadena(String cadena) {
        String invertido = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertido += cadena.charAt(i);
        }

        return invertido;
    }
}
