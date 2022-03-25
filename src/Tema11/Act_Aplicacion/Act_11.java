package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.11
 * Pide un valor double por consola y guárdalo en un archivo binario.
 */

import Utilidades.Teclado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Act_11 {
	public static void main (String[] args) {
		double valor = Teclado.getDouble("Introduce un valor: ");

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/act_apli_11.dat"))) {
			out.writeDouble(valor);
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
