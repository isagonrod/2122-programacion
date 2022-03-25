package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.14
 * Introduce por teclado una frase y guárdala en un archivo binario.
 * A continuación, recupérala y muéstrala por pantalla.
 */

import Utilidades.Teclado;

import java.io.*;

public class Act_14 {
	public static void main (String[] args) {
		String frase = Teclado.getString("Introduce una frase: ");

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/act_apli_14.dat"))) {
			out.writeObject(frase);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/act_apli_14.dat"))) {
			System.out.println(in.readObject());
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
