package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.17
 * Escribe un texto, línea a línea, de forma que, cada vez que se pulse Intro, se guarde la línea en un archivo binario.
 * El proceso se termina cuando introduzcamos una línea vacía.
 * Después el programa lee el texto completo del archivo y lo muestra por pantalla.
 */

import Utilidades.Teclado;

import java.io.*;

public class Act_17 {
    public static void main (String[] args) {
		escribirFichero();
		leerFichero();
    }

    static void escribirFichero() {
		String linea = "-";

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/texto.dat"))) {
			while (linea.compareToIgnoreCase("") != 0) {
				linea = Teclado.getString("Escribe línea de texto: ");
				out.writeObject(linea);
			}
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
    }

    static void leerFichero() {
		String linea;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/texto.dat"))) {
			while (true) {
				linea = (String) in.readObject();
				System.out.println(linea);
			}
		}
		catch (EOFException ex) {
			System.out.println("Fin de fichero");
		}
		catch (IOException|ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
