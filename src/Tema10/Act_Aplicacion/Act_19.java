package Tema10.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 10.19
 * Un encriptador es una aplicación que transforma un texto haciéndolo ilegible para aquellos que desconocen el código.
 * Diseña un programa que lea un fichero de texto, lo codifique y cree un nuevo archivo con el mensaje cifrado.
 * El alfabeto de codificación se encontrará en el fichero codec.txt
 */

import java.io.*;
import java.util.Scanner;

public class Act_19 {
    public static void main (String[] args) {
        char[][] abc = leeCodec();
        String fichero = leerFichero("fichero.txt");
        String ficheroEncriptado = encriptaContenido(fichero, abc);

        guardarFichero(ficheroEncriptado, "ficheroEncriptado.txt");
    }

    static char[][] leeCodec() {
        FileInputStream in1;
        Scanner sc;
        char[][] abc = new char[2][26];

        try {
            in1 = new FileInputStream("archivos_txt/codec.txt");
            sc = new Scanner(in1);

            abc[0] = sc.nextLine().toCharArray();
            abc[1] = sc.nextLine().toCharArray();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return abc;
    }

    static String leerFichero(String nombreFichero) {
        BufferedReader in = null;
        String contenido = "", linea;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/" + nombreFichero));
            linea = in.readLine();
            while (linea != null) {
                contenido += linea + '\n'; //TODO: hay que meter manualmente los saltos de línea??
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
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

        return contenido;
    }

    static void guardarFichero(String contenido, String destino) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("archivos_txt/" + destino));
            bw.write(contenido); //TODO: entiende esto los \n?
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage() + " - " + destino);
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

    static String encriptaContenido(String contenido, char[][] abc) {
        String resultado = contenido;
        char[] cadenaDesmenuzada;
        resultado = resultado.toLowerCase();
        cadenaDesmenuzada = new char[resultado.length()];

        for (int i = 0; i < resultado.length(); i++) {
            cadenaDesmenuzada[i] = codificaCaracter(abc[0], abc[1], resultado.charAt(i));
        }
        resultado = String.valueOf(cadenaDesmenuzada);

        return resultado;
    }

    static char codificaCaracter(char[] original, char[] sustituto, char c) {
        String conj1 = String.valueOf(original);
        char codificado;
        int pos = conj1.indexOf(c);
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = sustituto[pos];
        }
        return codificado;
    }
}
