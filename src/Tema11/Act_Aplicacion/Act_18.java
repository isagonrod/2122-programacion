package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.18
 * Un libro de firmas es útil para recoger los nombres de todas las personas que han pasado por un determinado lugar.
 * Crea una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre (comprobando que no se encuentre
 * repetido) usando el fichero binario firmas.dat
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Arrays;

public class Act_18 {
    public static void main (String[] args) {
		String[] libro = {"Antonio", "Belén", "Jacinto", "Manolo", "Miguel"};
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1,3);
			switch (opc) {
				case 1 -> {
					guardarLibro(libro);
					mostrarLibro();
				}
				case 2 -> libro = insertarFirma(libro);
				case 3 -> System.out.println("¡Adiós!");
			}
		} while (opc != 3);
    }

	static void menu() {
		System.out.println("-- MENÚ DE OPCIONES --");
		System.out.println("1. Mostrar el libro de firmas");
		System.out.println("2. Insertar nueva firma");
		System.out.println("3. Salir");
	}

	static void guardarLibro(String[] tabla) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/firmas.dat"))) {
			out.writeObject(tabla);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	static String[] insertarFirma(String[] tabla) {
		String[] aux = tabla;
		String nombreNuevo = Teclado.getString("Nombres nuevo: ");
		int posicion = Arrays.binarySearch(aux, nombreNuevo);

		if (posicion < 0) {
			posicion = Math.abs(posicion) - 1;

			aux = Arrays.copyOf(aux, aux.length + 1);
			System.arraycopy(aux, 0, aux, 0, posicion);
			System.arraycopy(aux, posicion, aux, posicion + 1, aux.length - posicion - 1);

			aux[posicion] = nombreNuevo;

			tabla = aux;
		}

		return tabla;
	}

	static void mostrarLibro() {
		String[] contenido;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/firmas.dat"))) {
			contenido = (String[]) in.readObject();
			for (String linea : contenido) {
				System.out.println(linea);
			}
		}
		catch (EOFException ex) {
			System.out.println("Fin de fichero");
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
