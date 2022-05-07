package Tema12.Act_Aplicacion.Act_25;

/* ACTIVIDAD DE APLICACIÓN 12.25
 * Implementa una aplicación que gestione un club donde se identifica a los socios por un apodo personal y único.
 * De cada socio, además del apodo, se guarda el nombre y su fecha de ingreso en el club.
 * Utiliza un mapa donde las claves serán los apodos y los valores, objetos de la clase Socio.
 * Los datos se guardarán en un fichero llamado "club.dat", de donde se leerá el mapa al arrancar y donde se volverá a
 * guardar actualizado al salir.
 * Las operaciones se mostrarán en un menú que tendrá las siguientes opciones:
 * 		1. Alta socio.
 * 		2. Baja socio.
 * 		3. Modificación socio.
 * 		4. Listar socios por apodo.
 * 		5. Listar socios por antigüedad.
 * 		6. Listar los socios con alta anterior a un año determinado.
 * 		7. Salir.
 */

import Utilidades.Teclado;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class PPSocioApodo {
	public static void main(String[] args) {
		Set<SocioApodo> club = leerFichero();
		int opc;

		do {
			menu();
			opc = Teclado.leerOpcion(1, 7);
			switch (opc) {
				case 1 -> club.add(new SocioApodo(Teclado.getString("Apodo: "), Teclado.getString("Nobre: "), Teclado.getString("Fecha de ingreso: ")));
				case 2 -> club.remove(new SocioApodo(Teclado.getString("Apodo del socio a dar de baja: ")));
				case 3 -> {
					String apodo = Teclado.getString("Apodo del socio a modificar: ");
					club.remove(new SocioApodo(apodo));
					club.add(new SocioApodo(apodo, Teclado.getString("Nombre: "), Teclado.getString("Fecha de ingreso: ")));
				}
				case 4 -> System.out.println("Listado de socios ordenados por APODO:\n" + club);
				case 5 -> {
					Set<SocioApodo> clubOrdenadoAntig = new TreeSet<>(new ComparaAntig());
					clubOrdenadoAntig.addAll(club);
					System.out.println("Listado de socios ordenados por ANTIGÜEDAD:\n" + clubOrdenadoAntig);
				}
				case 6 -> {
					String fecha = Teclado.getString("Año a buscar para listar los socios: ");
					System.out.println("Listado de socios con alta anterior al año " + fecha + ":");
					for (SocioApodo s : club) {
						if (s.esAnterior(fecha)) {
							System.out.println(s);
						}
					}
				}
				case 7 -> {
					guardarFichero(club);
					System.out.println("¡Adiós!");
				}
			}
		} while (opc != 7);
	}

	static void menu() {
		System.out.println("\n-- MENÚ DE OPCIONES --");
		System.out.println("1. Alta socio");
		System.out.println("2. Baja socio");
		System.out.println("3. Modificación socio");
		System.out.println("4. Listar socios por apodo");
		System.out.println("5. Listar socios por antigüedad");
		System.out.println("6. Listar los socios con alta anterior a un año determinado");
		System.out.println("7. Salir");
	}

	public static Set<SocioApodo> leerFichero() {
		Set<SocioApodo> conjunto = new TreeSet<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tema12/Act_Aplicacion/Act_25/club.dat"))) {
			conjunto = (TreeSet<SocioApodo>)in.readObject();
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return conjunto;
	}

	static void guardarFichero(Set<SocioApodo> conjunto) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema12/Act_Aplicacion/Act_25/club.dat"))) {
			out.writeObject(conjunto);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
