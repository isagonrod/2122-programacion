package Tema11.Act_Resueltas.Act_08;

/* ACTIVIDAD RESUELTA 11.8
 * Implementar un programa que guarde en el fichero socios.dat una tabla de objetos Socio.
 * Después se abrirá de nuevo el fichero en modo lectura para recuperar la tabla de socios, mostrándose por pantalla.
 */

import java.io.*;
import java.util.Arrays;

public class Act_08 {
	public static void main (String[] args) {
		Socio[] tablaSocios = new Socio[4];

		tablaSocios[0] = new Socio("1","Pepe");
		tablaSocios[1] = new Socio("11","Ana");
		tablaSocios[2] = new Socio("7","Pepa");
		tablaSocios[3] = new Socio("23","Cris");

		System.out.println(Arrays.deepToString(tablaSocios));

		try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("archivos_binary/socios.dat"))) {
			salida.writeObject(tablaSocios);
		}
		catch (IOException ex) {
			System.out.println(ex);
		}

		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("archivos_binary/socios.dat"))) {
			tablaSocios = (Socio[]) entrada.readObject();
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}

		System.out.println(Arrays.deepToString(tablaSocios));
	}
}
