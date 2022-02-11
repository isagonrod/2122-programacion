package Tema5.Act_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class Act_02 {

	/* Hacer una tabla de tipo entero con dimensión 10, y con un menú 
	 * (1. Insertar | 2. Rellenar tabla | 3. Listar | 4. Salir) 
	 * en la que también se puedan insertar datos y rellenar la tabla por completo.
	 */
	
	public static void main(String[] args) {
		int vector [] = new int [10];
		int nElementos = 0;
		int opc = 0;

		Scanner sc = new Scanner(System.in);
		
		do {
			menu();
			opc = leerOpcion();
			switch (opc) {
				case 1:
					nElementos = insertarElementos (vector, nElementos);
					break;
				case 2: 
					System.out.println("Introduce el valor: ");
					int valor = sc.nextInt();
					rellenar(vector, valor);
					nElementos = vector.length;
					break;
				case 3:
					listarElementos (vector, nElementos);
					break;
				case 4:
					System.out.println("¡Adios!");
					break;
			}
		} while (opc != 4);
	}

	static void menu () {
		System.out.println("MENÚ DE OPCIONES:");
		System.out.println("1. Insertar un elemento");
		System.out.println("2. Rellenar toda la tabla");
		System.out.println("3. Listado de elementos");
		System.out.println("4. Salir");
		System.out.println();
	}

	static int leerOpcion () {
		Scanner sc = new Scanner(System.in);
		int opcionValida;
		do {
			System.out.println("Elige una opción del menú: ");
			opcionValida = sc.nextInt();
		} while (opcionValida < 1 || opcionValida > 4);
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
	
	static void rellenar (int vector [], int valor) {
		/*for (int i = 0; i < vector.length; i++) {
			vector[i]=valor;
		} */
		Arrays.fill(vector, valor);
	}
}