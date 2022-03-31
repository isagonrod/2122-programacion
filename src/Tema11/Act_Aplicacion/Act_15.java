package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.15
 * Implementa un programa que lea números enteros desde el fichero numeros.dat y los vaya guardando en los ficheros
 * pares.dat e impares.dat, según su paridad.
 */

import java.io.*;

public class Act_15 {
	public static void main (String[] args) {
		procesarFichero("numeros");

		mostrarFichero("numeros");
		mostrarFichero("numerosPares");
		mostrarFichero("numerosImpares");
	}

	static void procesarFichero(String nombreFichero) {
		int numero;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/" + nombreFichero + ".dat"));
			 ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("archivos_binary/numerosPares.dat"));
			 ObjectOutputStream impares = new ObjectOutputStream(new FileOutputStream("archivos_binary/numerosImpares.dat"))) {
			while (true) {
				numero = in.readInt();
				if (numero % 2 == 0) {
					pares.writeInt(numero);
				}
				else {
					impares.writeInt(numero);
				}
			}
		}
		catch (EOFException ex) {
			System.out.println("Fin de fichero " + nombreFichero);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	static void mostrarFichero(String nombreFichero) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/" + nombreFichero + ".dat"))) {
			while (true) {
				System.out.println(in.readInt());
			}
		}
		catch (EOFException ex) {
			System.out.println("Fin de fichero " + nombreFichero);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
