package Proyectos_Menu;

import java.util.Arrays;
import java.util.Scanner;

public class nElementos {

    /* Vector de enteros de tamaño 10 sobre el que controlaremos la información útil introducida mediante la variable
     * nElementos, que contendrá el número de elementos que llevemos introducidos hasta ese momento.
	 *
     *  MENÚ DE OPCIONES:
     *  1. Insertar un elemento
     *  2. Rellenar toda la tabla con un valor
     *  3. Rellenar una parte de la tabla con un valor
     *  4. Listar
     *  5. Ordenar (algoritmo de la burbuja o similar)
     *  6. Búsqueda de un elemento (si la tabla ha sido ordenada usar el algoritmo de búsqueda binaria; en caso contrario
     *      el algoritmo de la búsqueda secuencial)
     *  7. Eliminar un elemento (reutilizar el método de búsqueda anterior y desplazar hacia la izquierda los elementos
     *      que están a la derecha del elemento a eliminar)
     *  8. Salir
     */

	public static void main(String[] args) {
		int vector [] = new int [10], nElementos = 0, opc = 0, valor = 0, desde, hasta, clave;
		boolean ordenada = false;
		
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
					if (ordenada == false) {
						System.out.println("El elemento " + clave + " está en la posición " + buscarElementoSec(vector,clave, nElementos));
					} else {
						System.out.println("El elemento " + clave + " está en la posición " + buscarElemento(vector,clave, valor));
					}
					break;
				case 7:
					clave = getNumber("¿Qué elemento quieres eliminar?");
					vector = eliminar(vector, clave, nElementos);
					System.out.println("Tabla reducida: " + Arrays.toString(vector));
					break;
				case 8:
					System.out.println("¡Adios!");
					break;
			}
		} while (opc != 8);
	}
	
	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static void menu () {
		System.out.println("\nMENÚ DE OPCIONES:");
		System.out.println("1. Insertar un elemento");
		System.out.println("2. Rellenar toda la tabla con un valor");
		System.out.println("3. Rellenar parte de la tabla con un valor");
		System.out.println("4. Listar la tabla");
		System.out.println("5. Ordenar la tabla");
		System.out.println("6. Búsqueda de un elemento");
		System.out.println("7. Eliminar un elemento");
		System.out.println("8. Salir\n");
	}
	
	static int leerOpcion () {
		int opcionValida;
		do {
			opcionValida = getNumber("Elige una opción del menú: ");
		} while (opcionValida < 1 || opcionValida > 8);
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
		/* for (int i = 0; i < vector.length; i++) {
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
	
	static int buscarElementoSec (int vector[], int clave, int nElementos) {
		boolean encontrado = false;
		int resultado = -1;
		int i;
		for (i = 0; i < nElementos && !encontrado; i++) {
			if (clave == vector[i]) {
				encontrado = true;
			}
		}
		if (encontrado) {
			resultado = i-1;
		}
		return resultado;
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

	/* Función para (7) ELIMINAR un elemento */

	static int[] eliminar (int vector[], int clave, int nElementos) {
		int posicion = buscarElementoSec (vector, clave, nElementos);
		if (posicion == -1) {
			System.out.println("Error: el elemento" + clave + " no existe.");
		} else {
			System.arraycopy(vector, posicion + 1, vector, posicion, vector.length - posicion -1);
			vector = Arrays.copyOf(vector, vector.length-1);
		}
		return vector;
	}
}