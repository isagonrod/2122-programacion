package Tema5.Act_Clase;

import java.util.Arrays;
import java.util.Scanner;

public class Act_04 {

	/* Hacer una tabla de tipo entero con dimensión 10, y con un menú 
	 * (1. Insertar | 2. Rellenar tabla | 3. Rellenar parte de la tabla | 4. Listar | 5. Ordenar | 6. Buscar | 7. Salir) 
	 * en la que también se puedan insertar datos y rellenar la tabla por completo.
	 */
	
	public static void main(String[] args) {
		int vector [] = new int [10], nElementos = 0, opc = 0, valor = 0, desde, hasta, clave;
		
		do {
			menu();
			opc = leerOpcion();
			switch (opc) {
				case 1:
					nElementos = insertarElementos (vector, nElementos);
					break;
				case 2: 
					valor = getNumber("Introduce el valor: ");
					rellenar(vector, valor);
					nElementos = vector.length;
					break;
				case 3:
					valor = getNumber("Introduce el valor: ");
					desde = getNumber("Introduce desde donde quieres rellenar la tabla");
					hasta = getNumber("Introduce hasta donde quieres rellenar la tabla");
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
					ordenar (vector, nElementos);
					break;
				case 6:
					clave = getNumber("¿Qué elementos quieres buscar?");
					System.out.println("El elemento " + clave + " están en la posición " + buscarElemento(vector,clave, valor));
					break;
				case 7:
					System.out.println("¡Adios!");
					break;
			}
		} while (opc != 7);
	}

	static void menu () {
		System.out.println("\nMENÚ DE OPCIONES:");
		System.out.println("1. Insertar un elemento");
		System.out.println("2. Rellenar toda la tabla");
		System.out.println("3. Rellenar parte de la tabla");
		System.out.println("4. Listado de elementos");
		System.out.println("5. Ordenar");
		System.out.println("6. Búsqueda de un elemento");
		System.out.println("7. Salir\n");
	}

	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int leerOpcion () {
		int opcionValida;
		do {
			opcionValida = getNumber("Elige una opción del menú: ");
		} while (opcionValida < 1 || opcionValida > 7);
		return opcionValida;
	}

	/* Función para (1) INSERTAR elementos en la tabla */
	
	static int insertarElementos (int vector[], int nElementos) {
		int nuevoElemento;

		if (vector.length > nElementos) {
			nuevoElemento = getNumber("Introducir un nuevo número para la tabla: ");
			vector[nElementos] = nuevoElemento;
			nElementos++;
		} else {
			System.out.println("La tabla está llena");
		}
		return nElementos;
	}
	
	/* Función para (2) RELLENAR la tabla completa */
	
	static void rellenar (int vector[], int valor) {
		/*for (int i = 0; i < vector.length; i++) {
			vector[i]=valor;
		} */
		Arrays.fill(vector, valor);
	}
	
	/* Función para (3) RELLENAR parte de la tabla */
	
	static void rellenar (int vector[], int desde, int hasta, int valor) {
		Arrays.fill(vector, desde, hasta, valor);
	}
	
	/* Función para (4) LISTAR los elementos de la tabla */
	
	static void listarElementos (int vector[], int nElementos) {
		if (nElementos == 0) {
			System.out.println("La tabla está vacía");
		}

		for (int i = 0; i < nElementos; i++) {
			System.out.println("El elemento " + i + " es: " + vector[i]);
		}
	}
	
	/* Función para (5) ORDENAR */
	
	static void ordenar (int vector[], int nElementos) {
		for (int i = 0; i < nElementos; i++) {
			for (int j = 0; j < nElementos; j++) {
				if (vector[j] > vector[i]) {
					int aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}
	
	/* Función para (6) BÚSQUEDA SECUENCIAL de elementos */
	
	static int buscarElemento (int vector[], int clave) {
		boolean encontrado = false;
		int i;
		for (i = 0; i < vector.length && !encontrado; i++) {
			if (clave == vector[i]) {
				encontrado = true;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}
	
	/* Función para (6) BÚSQUEDA BINARIA de elementos */
	
	static int buscarElemento (int vector[], int clave, int nElementos) {
		int inicio = 0;
		int fin = nElementos - 1;
		int posicion;
		while (inicio <= fin) {
			posicion = (inicio + fin) / 2;
			if (vector[posicion] == clave) {
				return posicion;
			} else if (vector[posicion] < clave) {
				inicio = posicion + 1;
			} else {
				fin = posicion - 1;
			}
		}
		return -1;
	}
	
}