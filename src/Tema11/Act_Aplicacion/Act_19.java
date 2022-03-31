package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.19
 * Por motivos puramente estadísticos se desea llevar constancia del número de llamadas recibidas cada día en una oficina.
 * Para ello, al terminar cada jornada laboral se guarda dicho número al final de un archivo binario.
 * Implementa una aplicación con un menú, que nos permita añadir el número correspondiente cada día y ver la lista
 * completa en cualquier momento.
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Arrays;

public class Act_19 {
	public static void main (String[] args) {
		Integer[] llamadas = {11111, 22222, 33333};
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1,4);
			switch (opc) {
				case 1 -> llamadas = insertarNumero(llamadas);
				case 2 -> mostrarLista(llamadas);
				case 3 -> guardarLlamadas(llamadas);
				case 4 -> System.out.println("¡Adiós!");
			}
		} while (opc != 4);
	}

	static void menu() {
		System.out.println("-- MENÚ DE OPCIONES --");
		System.out.println("1. Añadir número");
		System.out.println("2. Ver lista completa");
		System.out.println("3. Guardar");
		System.out.println("4. Salir");
	}

	static void guardarLlamadas(Integer[] tabla) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/llamadas.dat"))) {
			out.writeObject(tabla);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	static Integer[] insertarNumero(Integer[] tabla) {
		Integer numeroNuevo = Teclado.getNumber("Nombres nuevo: ");

		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = numeroNuevo;

		return tabla;
	}

	static void mostrarLista(Integer[] tabla) {
		for (Integer elemento : tabla) {
			System.out.println(elemento);
		}
	}
}
