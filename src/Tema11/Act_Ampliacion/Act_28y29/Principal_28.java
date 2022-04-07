package Tema11.Act_Ampliacion.Act_28y29;

/* ACTIVIDAD DE AMPLIACIÓN 11.28
 * Implementa la clase Socio para gestionar un club.
 * Sus atributos serán: el número de socio, que se adjudicará consecutivamente según el orden de alta en el club, el nombre,
 * la fecha de nacimiento, la fecha de alta, el teléfono y la dirección de correo electrónico.
 * Escribe un programa que gestione las altas, las bajas y las modificaciones de los datos (salvo el número de socio, que
 * es inalterable una vez asignado).
 * Entre las funcionalidades de la aplicación deberán incluirse un listado por orden alfabético de nombres y otro por
 * antigüedad en el club.
 * Toda esta información se mantendrá en un archivo binario.
 */

/* ACTIVIDAD DE AMPLIACIÓN 11.29
 * Desarrolla la Actividad 11.28 para añadir a la ficha de cada socio una lista de familiares a su cargo.
 * Para ello, define la clase Familiar con los atributos: dni, nombre y fecha de nacimiento.
 * Además, añade la opción de listar los datos de un socio incluyendo la lista de sus familiares ordenada por edad.
 */

import Utilidades.Teclado;

import java.io.*;

public class Principal_28 {
	public static void main (String[] args) {
		ConjuntoSocio tabla = cargarFichero();
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1, 6);
			switch (opc) {
				case 1 -> tabla.altaSocio(new Socio(
						Teclado.getString("Nombre: "),
						Teclado.getString("Fecha de nacimiento: "),
						Teclado.getString("Fecha de alta: "),
						Teclado.getNumber("Teléfono: "),
						Teclado.getString("Correo electrónico: ")));
				case 2 -> tabla.bajaSocio(Teclado.getNumber("Nº de socio a dar de baja: "));
				case 3 -> tabla.modificarDatosSocio(Teclado.getNumber("Nº de socio a modificar: "));
				case 4 -> tabla.listadoOrdenadoNombre();
				case 5 -> tabla.listadoOrdenadoAntigüedad();
				case 6 -> {
					guardarFichero(tabla);
					System.out.println("¡Adiós!");
				}
			}
		} while (opc != 6);
	}

	static void menu() {
		System.out.println("\n-- MENÚ DE OPCIONES --");
		System.out.println("1. Alta");
		System.out.println("2. Baja");
		System.out.println("3. Modificación");
		System.out.println("4. Listar por nombre");
		System.out.println("5. Listar por antigüedad");
		System.out.println("6. Salir\n");
	}

	static ConjuntoSocio cargarFichero() {
		ConjuntoSocio tabla = new ConjuntoSocio();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/socios_Act_28.dat"))) {
			while (true) {
				tabla.altaSocio((Socio) in.readObject());
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

	static void guardarFichero(ConjuntoSocio tabla) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/socios_Act_28.dat"))) {
			for (Socio cliente : tabla.getTabla()) {
				out.writeObject(cliente);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
