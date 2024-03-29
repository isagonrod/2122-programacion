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

        guardarFichero(ficheroEncriptado,"ficheroEncriptado.txt");
    }

    static char[][] leeCodec() {
        FileInputStream in;
        Scanner sc;
        char[][] abc = new char[2][26];

        try {
            in = new FileInputStream("archivos_txt/codec.txt");
            sc = new Scanner(in);

            abc[0] = sc.nextLine().toCharArray();
            abc[1] = sc.nextLine().toCharArray();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return abc;
    }

    static String leerFichero(String nombreFichero) { //TODO : integrar lectura y codificación, no hacerlo en secuencia (dice que sobra código porque no es eficiente del todo si sobra)
        BufferedReader in = null;
        String contenido = "", linea;

        try {
            in = new BufferedReader(new FileReader("archivos_txt/" + nombreFichero));
            linea = in.readLine();
            while (linea != null) {
                contenido += linea;
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

    /*
        // LECTURA Y ESCRITURA //
        try {
            lect = new BufferedReader(new FileReader("codificado.txt"));
            escr = new BufferedReader(new FileReader("decodificado.txt"));
            c = lect.read(); // caracter a decodificar
            while (c != -1) {
                escr.write(traduce((char)c, codec));
                c = lect.read();
            }
        } catch (IOException eof) {
            System.out.println("Error de fichero");
        } finally {
            if (lect != null) {
                try {
                    lect.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                if (escr != null) {
                    try {
                        escr.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }

        static char traduce (char c, char codec[][]) {
            char cod;
            int i = 0;
            while (i < codec[0].length && c != codec[0][i] {
                i++;
            }
            if (i < codec[0].length) {
                cod = codec[0][i];
            } else {
                cod = c;
            }
            return cod;
        }
     */

    static void guardarFichero(String contenido, String destino) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("archivos_txt/" + destino));
            bw.write(contenido);
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
