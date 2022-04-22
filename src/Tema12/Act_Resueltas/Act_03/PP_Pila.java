package Tema12.Act_Resueltas.Act_03;

/* ACTIVIDAD RESUELTA 12.3
 * Definir la interfaz Pila con parámetros genéricos.
 * A continuación, implementar la interfaz Pila genérica en la clase Contenedor.
 * Por último, escribir un programa donde se utilice un objeto contenedor como pila.
 * En ella apilamos números enteros positivos leídos del teclado hasta que se introduzca un -1.
 * Después, mediante un bucle, se desapilan todos los números hasta que la pila esté vacía y los mostramos por consola.
 */

import Utilidades.Teclado;

public class PP_Pila {
	public static void main(String[] args) {
		Pila<Integer> p = new Contenedor<>(new Integer[0]);
		Integer n = Teclado.getNumber("Introducir entero positivo (-1 para terminar): ");
		while (n != -1) {
			p.apilar(n);
			n = Teclado.getNumber("Introducir entero positivo (-1 para terminar): ");
		}
		System.out.println("Desapilamos: ");
		n = p.desapilar();
		while (n != null) {
			System.out.print(n + " ");
			n = p.desapilar();
		}
		System.out.println("");
	}
}
