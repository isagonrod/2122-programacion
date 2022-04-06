package Tema11.Act_Ampliacion.Act_27;

/* ACTIVIDAD DE AMPLIACIÓN 11.27
 * Implementa la clase Deportista para gestionar la sección de deportes de un club social.
 * Los atributos serán el DNI, el nombre, la fecha de nacimiento y el deporte que practica (enumerado), que deberá ser
 * uno de los que ofrece el club: natación, remo, vela y waterpolo.
 * Escribe una aplicación que gestione los datos de los deportistas, utilizando una tabla cuya longitud deberá ajustarse
 * con las altas y bajas, y un menú que incluya las opciones:
 * 		1. Alta
 * 		2. Baja
 * 		3. Modificación de datos (todos los atributos salvo el DNI, que es inalterable)
 * 		4. Listar por orden alfabético de nombres
 * 		5. Listar por orden de edad
 * 		6. Salir
 * Los datos se guardarán en un archivo binario, de donde se leerán al arrancar la aplicación y volverán a grabarse
 * actualizados al salir.
 */

import Utilidades.Teclado;

import java.io.*;

public class Principal_27 {
	public static void main (String[] args) {
		ConjuntoDeportistas tabla = cargarFichero();
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1, 6);
			switch (opc) {
				case 1 -> tabla.altaDeportista(new Deportista(
						Teclado.getNumber("DNI: "),
						Teclado.getString("Nombre: "),
						Teclado.getString("Fecha de nacimiento: "),
						Deporte.valueOf(Teclado.getString("Deporte: "))));
				case 2 -> tabla.bajaDeportista(Teclado.getNumber("DNI del deportista a dar de baja: "));
				case 3 -> tabla.modificarDatosDeportista(Teclado.getNumber("DNI del deportista a modificar: "));
				case 4 -> tabla.listadoOrdenadoNombre();
				case 5 -> tabla.listadoOrdenadoEdad();
				case 6 -> {
					guardarFichero(tabla);
					System.out.println("¡Adiós!");
				}
			}
		} while (opc != 6);
	}

	static public void menu() {
		System.out.println("\n-- MENÚ DE OPCIONES --");
		System.out.println("1. Alta");
		System.out.println("2. Baja");
		System.out.println("3. Modificar datos");
		System.out.println("4. Listar por nombre");
		System.out.println("5. Listar por edad");
		System.out.println("6. Salir\n");
	}

	static ConjuntoDeportistas cargarFichero() {
		ConjuntoDeportistas tabla = new ConjuntoDeportistas();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/deportistas.dat"))) {
			while (true) {
				tabla.altaDeportista((Deportista) in.readObject());
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

	static void guardarFichero(ConjuntoDeportistas tabla) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/deportistas.dat"))) {
			for (Deportista cliente : tabla.getTabla()) {
				out.writeObject(cliente);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
