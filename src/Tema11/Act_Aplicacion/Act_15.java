package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.15
 * Implementa un programa que lea números enteros desde el fichero numeros.dat y los vaya guardando en los ficheros
 * pares.dat e impares.dat, según su paridad.
 */

import java.io.*;
import java.util.Arrays;

public class Act_15 {
	public static void main (String[] args) {
		procesarFichero("numeros");
	}

	static void procesarFichero(String nombreFichero) {
		int numero;
		int[] par = new int[0], impar = new int[0];

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/" + nombreFichero + ".dat"))) {
			numero = in.readInt();
			if (numero / 2 == 0) {
				par = Arrays.copyOf(par, par.length + 1);
				for (int i = 0; i < par.length; i++) {
					par[i] = numero;
				}
				escribirFichero("numerosPares", par);
			}
			else {
				impar = Arrays.copyOf(impar, impar.length + 1);
				for (int i = 0; i < impar.length; i++) {
					impar[i] = numero;
				}
				escribirFichero("numerosImpares", impar);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	static void escribirFichero(String nombreFichero, int[] tabla) {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/" + nombreFichero + ".dat"))) {
			out.writeObject(tabla);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
