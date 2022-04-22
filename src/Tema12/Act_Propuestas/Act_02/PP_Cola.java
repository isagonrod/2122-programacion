package Tema12.Act_Propuestas.Act_02;

/* ACTIVIDAD PROPUESTA 12.2
 * Define la interfaz Cola con parámetros genéricos.
 * A continuación, implementa la interfaz Cola genérica en la clase Contenedor (no hace falta suprimir la implementación
 * de Pila de la Actividad resuelta 12.3).
 * Por último, escribe un programa donde se utilice un objeto Contenedor como Cola.
 * En ella encolamos números enteros positivos leídos del teclado hasta que se introduzca un -1.
 * Después, mediante un bucle, se desencolan todos los números hasta que la cola esté vacía y los mostramos por consola.
 */

import Tema12.Act_Resueltas.Act_03.Contenedor;
import Utilidades.Teclado;

public class PP_Cola {
	public static void main(String[] args) {
		Cola<Integer> c = new Contenedor<>(new Integer[0]);
		Integer n = Teclado.getNumber("Introducir entero positivo (-1 para terminar): ");
		while (n != -1) {
			c.encolar(n);
			n = Teclado.getNumber("Introducir entero positivo (-1 para terminar): ");
		}
		System.out.println("Desencolamos: ");
		n = c.desencolar();
		while (n != null) {
			System.out.print(n + " ");
			n = c.desencolar();
		}
		System.out.println("");
	}
}
