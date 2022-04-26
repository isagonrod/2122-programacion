package Tema12.Act_Aplicacion;

/* ACTIVIDAD DE APLICACIÓN 12.16
 * Implementa una aplicación que gestione los socios de un club usando la clase Socio implementada en la actividad
 * resuelta 12.11.
 * En particular, se deberán ofrecer las opciones de alta, baja y modificación de los datos de un socio.
 * Además, se listarán los socios por nombre o por antigüedad en el club.
 */

import Tema12.Act_Resueltas.Act_11.ComparaNombre;
import Tema12.Act_Resueltas.Act_11.ComparaAntiguedad;
import Tema12.Act_Resueltas.Act_11.Socio;
import Utilidades.Teclado;

import java.io.*;
import java.util.*;

public class Act_16 {
    public static void main(String[] args) {
        List<Socio> club = leerFichero();
        int opc;

        do {
            menu();
            opc = Teclado.leerOpcion(1, 6);
			switch (opc) {
				case 1 -> alta(club, Teclado.getString("DNI: "));
				case 2 -> club.remove(new Socio(Teclado.getString("DNI del socio que se quiere dar de baja: ")));
				case 3 -> {
					String dni = Teclado.getString("DNI: ");
					club.remove(new Socio(dni));
					alta(club,dni);
				}
				case 4 -> {
					Set<Socio> clubOrdenadoNombre = new TreeSet<>(new ComparaNombre());
					clubOrdenadoNombre.addAll(club);
					System.out.println("Listado de socios ordenado por NOMBRE: " + clubOrdenadoNombre);
				}
				case 5 -> {
					Set<Socio> clubOrdenadoAntig = new TreeSet<>(new ComparaAntiguedad());
					clubOrdenadoAntig.addAll(club);
					System.out.println("Listado de socios ordenado por ANTIGÜEDAD: " + clubOrdenadoAntig);
				}
				case 6 -> {
					guardarFichero(club);
					System.out.println("¡Adiós!");
				}
			}
        }
        while (opc != 6);
    }

    static void menu() {
        System.out.println("-- MENÚ DE OPCIONES --");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificación");
		System.out.println("4. Listar socios por nombre");
		System.out.println("5. Listar socios por antigüedad");
        System.out.println("6. Salir");
    }

	public static boolean alta(List<Socio> socios, String dni) {
		String nombre = Teclado.getString("Nombre: ");
		String fechaAlta = Teclado.getString("Fecha de alta: ");
		Socio nuevo = new Socio(dni, nombre, fechaAlta);
		return socios.add(nuevo);
	}

	public static List<Socio> leerFichero() {
		List<Socio> conjunto = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Tema12/Act_Aplicacion/socios.dat"))) {
			conjunto = (ArrayList<Socio>)in.readObject();
		}
		catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		return conjunto;
	}

	static void guardarFichero(List<Socio> conjunto) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Tema12/Act_Aplicacion/socios.dat"))) {
			out.writeObject(conjunto);
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
