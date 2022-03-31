package Tema11.Act_Aplicacion.Act_20;

/* ACTIVIDAD DE APLICACIÓN 11.20
 * Implementa una aplicación que permita guardar y recuperar los datos de los clientes de una empresa.
 * Para ello, define la clase Cliente, que tendrá los atributos: id (identificador de cliente), nombre y telefono.
 * Los objetos Cliente se insertará en una tabla.
 * Para realizar las distintas operaciones, la aplicación tendrá el siguiente menú:
 *  1. Añadir nuevo cliente.
 *  2. Modificar datos.
 *  3. Dar de baja cliente.
 *  4. Listar los clientes.
 * La información se guardará en un fichero binario, que se cargará en la memoria al iniciar la aplicación y se grabará
 * en disco, actualizada, al terminar.
 */

import Utilidades.Teclado;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Principal_20 {
	public static void main (String[] args) {
		ConjuntoCliente tabla = new ConjuntoCliente();
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1,5);
			switch (opc) {
				case 1 -> tabla.insertarCliente(new Cliente(Teclado.getString("ID: "), Teclado.getString("Nombre: "), Teclado.getString("Teléfono: ")));
				case 5 -> System.out.println("¡Adiós!");
			}
		} while (opc != 5);
	}

	static void menu() {
		System.out.println("-- MENÚ DE OPCIONES --");
		System.out.println("1. Añadir nuevo cliente");
		System.out.println("2. Modificar datos");
		System.out.println("3. Dar de baja cliente");
		System.out.println("4. Listar los clientes");
		System.out.println("5. Salir");
	}

	static void cargarFichero() {
		String linea;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/clientes.dat"))) {
			linea = (String) in.readObject();
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
