package Tema5.Act_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class Act_03 {

	/* Hacer una tabla de tipo entero con dimensión 10, y con un menú 
	 * (1. Insertar | 2. Rellenar tabla | 3. Rellenar parte de la tabla | 4. Listar | 5. Salir) 
	 * en la que también se puedan insertar datos y rellenar la tabla por completo.
	 */
	
	public static void main(String[] args) {
		int vector [] = new int [10], nElementos = 0, opc = 0, valor, desde, hasta;

		
		do {
			menu();
			opc = leerOpcion();
			switch (opc) {
				case 1:
					nElementos = insertarElementos (vector, nElementos);
					break;
				case 2: 
					valor=getNumber("Introduce el valor: ");
					rellenar(vector, valor);
					nElementos = vector.length;
					break;
				case 3:
					valor=getNumber("Introduce el valor: ");
					desde=getNumber("Introduce desde donde quieres rellenar la tabla");
					hasta=getNumber("Introduce hasta donde quieres rellenar la tabla");
					if (nElementos >= hasta || nElementos >= desde) {
						rellenar (vector, desde, hasta, valor);
						if (nElementos < hasta) {
							nElementos=hasta;
						}
					} else {
						System.out.println("No se puede realizar: limites inválidos");
					}
					break;
				case 4:
					listarElementos (vector, nElementos);
					break;
				case 5:
					System.out.println("¡Adios!");
					break;
			}
		} while (opc != 5);
	}

	static void menu () {
		System.out.println("MENÚ DE OPCIONES:");
		System.out.println("1. Insertar un elemento");
		System.out.println("2. Rellenar toda la tabla");
		System.out.println("3. Rellenar parte de la tabla");
		System.out.println("4. Listado de elementos");
		System.out.println("5. Salir");
		System.out.println();
	}

	static int leerOpcion () {
		int opcionValida;
		do {
			opcionValida=getNumber("Elige una opción del menú: ");
		} while (opcionValida < 1 || opcionValida > 5);
		return opcionValida;
	}

	static int insertarElementos (int vector [], int nElementos) {
		int nuevoElemento;

		if (vector.length > nElementos) {
			nuevoElemento=getNumber("Introducir un nuevo número para la tabla: ");
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
	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static void rellenar (int vector [], int valor) {
		/*for (int i = 0; i < vector.length; i++) {
			vector[i]=valor;
		} */
		Arrays.fill(vector, valor);
	}
	
	static void rellenar (int vector [], int desde, int hasta, int valor) {
		Arrays.fill(vector, desde, hasta, valor);
	}
	
}
