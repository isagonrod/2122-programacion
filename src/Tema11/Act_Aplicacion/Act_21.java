package Tema11.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 11.21
 * Repite la Actividad de aplicación 11.20, pero insertando los objetos Cliente en un objeto Lista para Object, como el
 * definido en la Actividad resuelta 9.11
 */

import Tema11.Act_Aplicacion.Act_20.Cliente;
import Tema9.Act_Aplicacion.Act_11y12_15a18_24y25.Lista;
import Utilidades.Teclado;

import java.io.*;

public class Act_21 {
    public static void main (String[] args) {
		Lista tabla = cargarFichero();
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1,5);
			switch (opc) {
				case 1 -> tabla.encolar(new Cliente(Teclado.getString("ID: "), Teclado.getString("Nombre: "), Teclado.getString("Teléfono: ")));
				case 2 -> modificarDatos(tabla, Teclado.getString("ID del cliente que quieres modificar: "));
				case 3 -> tabla.eliminar(buscar(tabla, Teclado.getString("ID del cliente al que quieres dar de baja: ")));
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
		System.out.println("1. Añadir nuevo cliente");
		System.out.println("2. Modificar datos");
		System.out.println("3. Dar de baja cliente");
		System.out.println("4. Listar los clientes");
		System.out.println("5. Salir");
	}

	static Lista cargarFichero() {
		Lista tabla = new Lista();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivos_binary/clientes2.dat"))) {
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
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("archivos_binary/clientes2.dat"))) {
			for (Object elemento : tabla.getTabla()) {
				out.writeObject(elemento);
			}
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	static int buscar(Lista tabla, String id) {
		int indice = -1;
		for (int i = 0; i < tabla.getLength() && indice == -1; i++) {
			if (((Cliente)tabla.get(i)).getId().compareToIgnoreCase(id) == 0) {
				indice = i;
			}
		}
		return indice;
	}

	static Cliente modificarDatos(Lista tabla, String id) {
		Cliente cliente = null;
		int posicion = buscar(tabla, id);

		if (posicion >= 0) {
			((Cliente)tabla.get(posicion)).setNombre(Teclado.getString("Nuevo nombre: "));
			((Cliente)tabla.get(posicion)).setTelefono(Teclado.getString("Nuevo teléfono: "));
			cliente = ((Cliente)tabla.get(posicion));
		}

		return cliente;
	}
}
