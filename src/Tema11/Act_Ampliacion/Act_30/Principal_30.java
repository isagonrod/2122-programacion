package Tema11.Act_Ampliacion.Act_30;

/* ACTIVIDAD DE AMPLIACIÓN 11.30
 * Con la clase Jornada de la Actividad de ampliación 9.28, implementa una aplicación que gestione una lista con las
 * jornadas de los trabajadores, controlando las entradas y salidas (lo que comúnmente se llama "fichar").
 * El programa pedirá el DNI del usuario.
 * A continuación, presentará un menú: 1. Entrada, y 2. Salida.
 * Al elegir la opción se leerá la fecha y hora, que se asignará al atributo correspondiente.
 * Con esta información se creará un registro de la jornada.
 * La aplicación terminará cuando se introduzca como dni un número clave que solo conoce un directivo responsable.
 * Los registros se insertarán, según el orden natural descrito en la Actividad de ampliación 9.28, en una tabla
 * redimensionable, que se grabará en disco al finalizar la aplicación y se volverá a cargar al arrancar al día siguiente.
 */

import Utilidades.Teclado;

import java.io.*;

public class Principal_30 {
	public static void main(String[] args) {
		ConjuntoJornadas tabla = cargarFichero();
		int opc;
		String dni = "", fechaActual = null;

		do {
			if (dni.equals("")) {
				dni = Teclado.getString("Introduce el DNI: ");
				tabla.altaJornada(new Jornada(dni));
			}

			if (!dni.equals("0000")) {
				menu();
				opc = Teclado.leerOpcion(1, 2);
				switch (opc) {
					case 1 -> {
						fechaActual = Teclado.getString("Fecha: ");
						tabla.entrada(dni, fechaActual, Teclado.getString("Hora de entrada: "));
					}
					case 2 -> {
						tabla.salida(dni, fechaActual, Teclado.getString("Hora de salida: "));
						dni = "";
					}
				}
			}
			else {
				guardarFichero(tabla);
				System.out.println("¡Adiós!");
			}
		} while (!dni.equals("0000"));
	}

	static void menu() {
		System.out.println("\n-- MENÚ DE OPCIONES --");
		System.out.println("1. Entrada");
		System.out.println("2. Salida\n");
	}

	static ConjuntoJornadas cargarFichero() {
		ConjuntoJornadas tabla = new ConjuntoJornadas();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/jornadas.dat"))) {
			while (true) {

				tabla.altaJornada((Jornada) in.readObject());
			}
		}
		catch (EOFException ex) {
			System.out.println("Fin de fichero");
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return tabla;
	}

	static void guardarFichero(ConjuntoJornadas tabla) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/jornadas.dat"))) {
			for (Jornada jornada : tabla.getTabla()) {
				out.writeObject(jornada);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
