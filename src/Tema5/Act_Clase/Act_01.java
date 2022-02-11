package Tema5.Act_Clase;

import java.util.Scanner;

public class Act_01 {

	/* Hacer una tabla de tipo entero con dimensión 10, y con un menú (1. Insertar | 2. Listar | 3. Salir) en la que
	 * también se puedan insertar datos.
	 */
	
	public static void main(String[] args) {
		int vector [] = new int [10];
		int nElementos = 0;
		int opc = 0;

		do {
			menu();
			opc = leerOpcion();
			switch (opc) {
				case 1 -> nElementos = insertarElementos (vector, nElementos);
				case 2 -> listarElementos (vector, nElementos);
				case 3 -> System.out.println("Salir");
			}
		} while (opc != 3);
	}

	static void menu () {
		System.out.println("MENÚ DE OPCIONES:");
		System.out.println("1. Insertar un elemento");
		System.out.println("2. Listado de elementos");
		System.out.println("3. Salir");
		System.out.println();
	}

	static int leerOpcion () {
		Scanner sc = new Scanner(System.in);
		int opcionValida;
		do {
			System.out.println("Elige una opción del menú: ");
			opcionValida = sc.nextInt();
		} while (opcionValida < 1 || opcionValida > 3);
		return opcionValida;
	}

	static int insertarElementos (int vector [], int nElementos) {
		Scanner sc = new Scanner(System.in);
		int nuevoElemento;

		if (vector.length > nElementos) {
			System.out.println("Introducir un nuevo número para la tabla: ");
			nuevoElemento = sc.nextInt();
			vector [nElementos] = nuevoElemento;
			nElementos++;
		} else {
			System.out.println("La tabla está llena");
		}
		return nElementos;
	}

	static void listarElementos (int vector [], int nElementos) {
		if (nElementos == 0) {
			System.out.println("La tabla está vacía");
		}

		for (int i = 0; i < nElementos; i++) {
			System.out.println("El elemento " + i + " es: " + vector[i]);
		}
	}
}