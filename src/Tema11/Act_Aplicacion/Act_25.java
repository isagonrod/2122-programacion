package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.25
 * En una tabla de cadenas se guardan los nombres de 4 ficheros binarios.
 * En cada uno de ellos se guarda una tabla de números enteros ordenados en sentido creciente.
 * Implementa una aplicación donde se introduce por teclado un número entero.
 * El programa debe determinar si ese número se halla en alguno de los 4 ficheros y, en caso afirmativo, en cuál de ellos
 * y en qué lugar de la tabla correspondiente.
 */

import Utilidades.Teclado;

import java.io.*;

public class Act_25 {
	public static void main (String[] args) {
		String[] cadenas = {"num1_act25", "num2_act25", "num3_act25", "num4_act25"};
//		int[] num1 = {1, 3, 5, 7, 9};
//		int[] num2 = {2, 4, 6, 8, 10};
//		int[] num3 = {11, 13, 15, 17, 19};
//		int[] num4 = {12, 14, 16, 18, 20};
//
//		guardarEnFichero(num1, cadenas[0]);
//		guardarEnFichero(num2, cadenas[1]);
//		guardarEnFichero(num3, cadenas[2]);
//		guardarEnFichero(num4, cadenas[3]);

		int numero = Teclado.getNumber("Introduce un número: ");

		buscarEnFicheros(numero, cadenas);
	}

	static void guardarEnFichero(int[] tabla, String nombreFichero) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/" + nombreFichero + ".dat"))) {
			for (Integer num : tabla) {
				out.writeInt(num);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	static int[] leerFicheros(String nombreFichero) {
		int[] tabla = new int[5];
		int i = 0;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/" + nombreFichero + ".dat"))) {
			while (true) {
				tabla[i] = in.readInt();
				i++;
			}
		}
		catch (EOFException e) {
			System.out.println("Se ha leído el fichero " + nombreFichero);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return tabla;
	}

	static void buscarEnFicheros(int numero, String[] cadenas) {
		int[] t1 = leerFicheros(cadenas[0]);
		int[] t2 = leerFicheros(cadenas[1]);
		int[] t3 = leerFicheros(cadenas[2]);
		int[] t4 = leerFicheros(cadenas[3]);

		buscarPosicion(numero, t1, "num1_act25.dat");
		buscarPosicion(numero, t2, "num2_act25.dat");
		buscarPosicion(numero, t3, "num3_act25.dat");
		buscarPosicion(numero, t4, "num4_act25.dat");
	}

	static void buscarPosicion(int numero, int[] t1, String fichero) {
		int posicion = -1;
		for (int i = 0; i < t1.length && posicion == -1; i++) {
			if (t1[i] == numero) {
				posicion = i;
				System.out.println("\nEl número " + numero + " está en el fichero " + fichero +
									"\nSu posición es la " + posicion);
			}
		}
	}
}
