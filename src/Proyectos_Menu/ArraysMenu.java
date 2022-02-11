package Proyectos_Menu;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMenu {

	/* En este ejercicio probaremos diversas operaciones o métodos de la clase ARRAYS que se van indicando entre paréntesis
	 * con cada opción del menú. Al iniciar el programa pulsar la opción (1) y luego la (2), antes del resto.
	 *
	 *	MENÚ DE OPCIONES:
	 *	1. Rellenar la tabla completa con 10 elementos (números aleatorios entre 1 y 100)
	 *	2. Ordenar (Arrays.sort)
	 *	3. Búsqueda de un elemento (Arrays.binarySearch)
	 *	4. Listar (Arrays.toString)
	 *	5. Insertar un nuevo elemento (Arrays.binarySearch | System.arraycopy): Redimensionar la tabla cada vez que se
	 *		inserte un nuevo elemento.
	 *	6. Eliminar un elemento (Arrays.binarySearch | System.arraycopy | Arrays.copyOf): La tabla debe seguir ordenada
	 *		después de eliminar el elemento requerido.
	 *	7. Salir
	 */

	public static void main(String[] args) {
		int vector[] = new int [10], nElementos = 0, opc = 0, clave, nuevo;
		
		do {
			menu();
			opc = leerOpcion();
			switch (opc) {
				case 1:
					rellenar (vector, nElementos);
					break;
				case 2: 
					Arrays.sort(vector);
					break;
				case 3:
					clave = getNumber("¿Qué elementos quieres buscar?");
					System.out.println("El elemento " + clave + " está en la posición " + Arrays.binarySearch(vector, clave));
					break;
				case 4:
					System.out.println(Arrays.toString(vector));
					break;
				case 5:
					nuevo = getNumber("¿Qué numero quieres introducir?");
					System.out.println("Tabla original: " + Arrays.toString(vector));
					vector = insercionOrdenada(vector,nuevo);
					System.out.println("Tabla ampliada: " + Arrays.toString(vector));
					break;
				case 6:
					clave = getNumber("¿Qué elemento quieres eliminar?");
					vector = eliminar(vector,clave);
					System.out.println("Tabla reducida: " + Arrays.toString(vector));
					break;
				case 7:
					System.out.println("¡Adios!");
					break;
			}
		} while (opc != 7);
	}
	
	static int getNumber(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}

	/* Función para MOSTRAR el menú por pantalla */
	
	static void menu () {
		System.out.println("\nMENÚ DE OPCIONES:");
		System.out.println("1. Rellenar la tabla completa con números aleatorios");
		System.out.println("2. Ordenar elementos");
		System.out.println("3. Búsqueda de un elemento");
		System.out.println("4. Listar los elementos");
		System.out.println("5. Insertar un nuevo elemento");
		System.out.println("6. Eliminar un elemento");
		System.out.println("7. Salir\n");
	}
	
	/* Función para PEDIR UNA OPCIÓN del menú */
	
	static int leerOpcion () {
		int opcionValida;
		do {
			opcionValida = getNumber("Elige una opción del menú: ");
		} while (opcionValida < 1 || opcionValida > 7);
		return opcionValida;
	}
	
	/* Función para (1) RELLENAR la tabla con números aleatorios */
	
	static void rellenar (int vector[], int nElementos) {
		for (int i = 0; i < vector.length; i++) {
			nElementos = (int)(Math.random() * 100 + 1);
			vector[i] = nElementos;
		}
	}
	
	/* Función para (5) INSERTAR un nuevo elemento */
	
	static int [] insercionOrdenada (int table[], int nuevo) {
		Arrays.sort(table);
		int indiceInsercion = Arrays.binarySearch(table, nuevo);
		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion -1;
		}
		int newTable[] = new int [table.length +1];
		
		System.arraycopy(table, 0, newTable, 0, indiceInsercion);	/* copia lo de delante y lo de detrás del hueco nuevo */
		System.arraycopy(table, indiceInsercion, newTable, indiceInsercion + 1, table.length - indiceInsercion);
		
		newTable[indiceInsercion] = nuevo;
		table = newTable;
		
		return newTable;
	}

	/* Función para (6) ELIMINAR un elemento */

	static int[] eliminar (int vector[], int clave) {
		int posicion = Arrays.binarySearch(vector, clave);
		if (posicion == -1) {
			System.out.println("Error: el elemento" + clave + " no existe.");
		} else {
			System.arraycopy(vector, posicion + 1, vector, posicion, vector.length - posicion -1);
			vector = Arrays.copyOf(vector, vector.length-1);
		}
		return vector;
	}
}
