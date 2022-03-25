package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.13
 * Escribe un programa que lea de un fichero binario una tabla de números double
 * y después muestre el contenido de la tabla por consola.
 */

import java.io.*;
import java.util.Arrays;

public class Act_13 {
	public static void main (String[] args) {
		double[] tabla = {2.33, 69.69, 9.01, 3.44, 1.11};

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/act_apli_13.dat"))) {
			out.writeObject(tabla);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/act_apli_13.dat"))) {
			System.out.println(Arrays.toString((double[]) in.readObject()));
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
