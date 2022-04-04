package Tema11.Act_Aplicacion.Act_22;

/* ACTIVIDAD DE APLICACIÓN 11.22
 * Implementa una aplicación que gestione los empleados de un banco.
 * Para ello se definirá la clase Empleado con los atributos dni, nombre y sueldo.
 * Los empleados se guardarán en un objeto de la clase Lista para objetos de la clase Object.
 * La aplicación cargará en la memoria, al arrancar, la lista de empleados desde el archivo binario empleados.dat y
 * mostrará un menú con las siguientes opciones:
 *      1. Alta empleado.
 *      2. Baja empleado.
 *      3. Mostrar datos empleado.
 *      4. Listar empleados.
 *      5. Salir.
 * Al pulsar 5, se grabará en el disco la lista actualizada y terminará el programa.
 */

import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;
import Utilidades.Teclado;

import java.io.*;

public class Principal_22 {
	public static void main (String[] args) {
		Lista tabla = cargarFichero();
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1, 5);
			switch (opc) {
				case 1 -> tabla.encolar(new Empleado(Teclado.getNumber("DNI: "), Teclado.getString("Nombre: "), Teclado.getDouble("Sueldo: ")));
				case 2 -> tabla.eliminar(buscar(tabla, Teclado.getNumber("Introduce el DNI del empleado a eliminar: ")));
				case 3 -> mostrarEmpleado(tabla, Teclado.getNumber("Introduce el DNI del empleado a mostrar: "));
				case 4 -> System.out.println(tabla);
				case 5 -> {
					guardarFichero(tabla);
					System.out.println("¡Adiós!");
				}
			}
		} while (opc != 5);
	}

	static void menu() {
		System.out.println("-- MENÚ DE OPCIONES --");
		System.out.println("1. Alta empleado");
		System.out.println("2. Baja empleado");
		System.out.println("3. Mostrar datos empleado");
		System.out.println("4. Listar empleados");
		System.out.println("5. Salir");
	}

	static void mostrarEmpleado(Lista tabla, int dni) {
		int indice = buscar(tabla, dni);
		System.out.println(tabla.get(indice));
	}

	static int buscar(Lista tabla, int dni) {
		int indice = -1;
		for (int i = 0; i < tabla.getLength() && indice == -1; i++) {
			if (((Empleado)tabla.get(i)).getDni() == dni) {
				indice = i;
			}
		}
		return indice;
	}

	static Lista cargarFichero() {
		Lista tabla = new Lista();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/empleados.dat"))) {
			while (true) {
				tabla.encolar(in.readObject());
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

	static void guardarFichero(Lista tabla) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/empleados.dat"))) {
			for (Object elemento : tabla.getTabla()) {
				out.writeObject(elemento);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
