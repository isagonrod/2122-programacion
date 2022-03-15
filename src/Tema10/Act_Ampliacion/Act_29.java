package Tema10.Act_Ampliacion;

/* ACTIVIDAD DE AMPLIACIÓN 10.29
 * Escribe un programa que pida el nombre de un fichero de texto que contenga código fuente de Java.
 * El programa debe crear un nuevo fichero que tenga como nombre el mismo del fichero original con el prefijo "sin_comentarios_".
 * El nuevo fichero tendrá como contenido el código fuente sin ningún tipo de comentarios.
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Scanner;

public class Act_29 {
    public static void main (String[] args) {
        String ficheroOrigen, contenidoFichero;

        ficheroOrigen = Teclado.getString("Introduzca el nombre del fichero a procesar: ");
        contenidoFichero = leerFichero(ficheroOrigen);
        contenidoFichero = eliminarComentarios(contenidoFichero);
        guardarFichero(contenidoFichero, ficheroOrigen);
    }

    static String leerFichero (String ficheroOrigen) {
        BufferedReader in = null;
        String linea, contenido = "";

        try {
            in = new BufferedReader(new FileReader("archivos_txt/" + ficheroOrigen + ".java"));

            linea = in.readLine();
            while (linea != null) {
                contenido += linea + "\n";
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage() + " - " + ficheroOrigen);
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

    static String eliminarComentarios(String contenidoFichero) {
        String resultado = "", linea;
        int indice;
        boolean comentarioAbierto = false;
        Scanner sc = new Scanner(contenidoFichero);

        while(sc.hasNextLine()) {
            linea = sc.nextLine();
            if (!linea.contains("//") && !linea.contains("/*") && !linea.contains("*") && !linea.contains("*/")
                && !comentarioAbierto) {
                resultado += linea + "\n";
            }
            else if(linea.contains("//")) {
                indice = linea.indexOf("//");
                resultado += linea.substring(0, indice) + "\n";
            }
            else if(linea.contains("/*")) {
                indice = linea.indexOf("/*");
                if (!linea.contains("*/")) {
                    resultado += linea.substring(0, indice) + "\n";
                    comentarioAbierto = true;
                }
                else {
                    resultado += linea.substring(0, indice) + linea.substring(linea.indexOf("*/") + 2) + "\n";
                }
            }
            else if(linea.contains("*/")) {
                indice = linea.indexOf("*/");
                resultado += linea.substring(indice + 2) + "\n";
                comentarioAbierto = false;
            }
        }

        return resultado;
    }

    static void guardarFichero (String contenido, String ficheroDestino) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("archivos_txt/sin_comentarios_" + ficheroDestino + ".java"));
            bw.write(contenido);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage() + " - " + ficheroDestino);
        }
        finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
